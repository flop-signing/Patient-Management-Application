# Patient Monitoring System

A comprehensive microservices-based healthcare management system built with Spring Boot, Docker, gRPC, Kafka, and AWS infrastructure.


## 🏗 System Architecture

The system follows a microservices architecture with the following components:

- **Patient Service**: Core patient management with CRUD operations  
- **Billing Service**: Handles billing operations via gRPC  
- **Analytics Service**: Processes patient events from Kafka  
- **Auth Service**: JWT-based authentication and authorization  
- **API Gateway**: Central entry point with JWT validation  
- **Kafka Broker**: Message streaming for event-driven communication  
- **PostgreSQL Databases**: Persistent data storage for each service  

![Architecture Diagram](docs/architecture.png)

## ✨ Features

- **Patient Management**: Complete CRUD operations for patient records  
- **Authentication**: JWT-based secure authentication  
- **Event Streaming**: Real-time patient event processing with Kafka  
- **gRPC Communication**: Efficient service-to-service communication  
- **API Gateway**: Unified API entry point with security  
- **Dockerized Services**: Containerized deployment  
- **AWS Infrastructure**: Cloud-ready infrastructure as code  
- **OpenAPI Documentation**: Comprehensive API documentation  

## 🛠 Technology Stack

### Backend
- Java 21 with Spring Boot 3.x  
- Spring Data JPA  
- Spring Security  
- gRPC for inter-service communication  
- Apache Kafka for event streaming  
- JWT authentication  

### Database
- PostgreSQL  

### Infrastructure
- Docker & Docker Compose  
- AWS CDK for infrastructure as code  
- LocalStack for local AWS development  
- AWS CLI  

### Tools
- Maven for dependency management  
- OpenAPI for API documentation  
- Protocol Buffers for gRPC  

## 📋 Prerequisites

Before running the system, ensure you have:

1. Java 21 JDK  
2. Docker & Docker Compose  
3. Node.js (for AWS CDK)  
4. AWS CLI (for LocalStack)  
5. Maven  
6. Git  

