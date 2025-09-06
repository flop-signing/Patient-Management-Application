package com.pm.stack;


import software.amazon.awscdk.*;

public class LocalStack extends Stack {

    public LocalStack(final App scope, final String id, final StackProps props){
        super(scope, id,props);
    }

    public static void main(String[] args) {
        App app=new App(AppProps.builder().outdir("./cdk.out").build());

        // synthesizer is converted to our java code into cloud formation template.
        StackProps props=StackProps.builder()
                .synthesizer(new BootstraplessSynthesizer())
                .build();

        new LocalStack(app,"localstack",props);
        app.synth();

        System.out.println("App Synthesizing in progress...");
    }

}
