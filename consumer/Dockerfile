FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY build/libs/consumer.jar consumer.jar
ENTRYPOINT ["java","-jar","consumer.jar"]