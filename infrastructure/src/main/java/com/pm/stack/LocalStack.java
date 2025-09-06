package com.pm.stack;


import software.amazon.awscdk.*;
import software.amazon.awscdk.services.ec2.Vpc;

public class LocalStack extends Stack {

    private final Vpc vpc;


    public LocalStack(final App scope, final String id, final StackProps props) {
        super(scope, id, props);
        this.vpc = createVpc();
    }


    private Vpc createVpc() {
        return Vpc.Builder.create(this, "PatientManagementVPC").vpcName("PatientManagementVPC").maxAzs(2).build();
    }


    public static void main(String[] args) {
        App app = new App(AppProps.builder().outdir("./cdk.out").build());

        // synthesizer is converted to our java code into cloud formation template.
        StackProps props = StackProps.builder()
                .synthesizer(new BootstraplessSynthesizer())
                .build();

        new LocalStack(app, "localstack", props);
        app.synth();

        System.out.println("App Synthesizing in progress...");
    }

}
