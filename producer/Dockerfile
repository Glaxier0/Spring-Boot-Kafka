FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY build/libs/producer.jar producer.jar
ENTRYPOINT ["java","-jar","producer.jar"]