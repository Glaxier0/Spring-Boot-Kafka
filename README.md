# Spring-Boot-Kafka-Producer-Consumer-with-Docker-Compose
Kafka producer/consumer docker-compose app with producer rest api written in Java Spring Boot

# How to build
This step is redundant if you just want to use program. Follow this steps if you want to change the code. Otherwise follow [this](https://github.com/Glaxier0/Spring-Boot-Kafka#how-to-run).
 - If you want to build your own images instead of pulling from mine docker hub.
 - First thing you have to do is go in to each producer and consumer roots.
 - And run gradle build.
 ```
gradle build
```
 - After gradle build completed run this command.
```
docker build -t {your_docker_hub_name}/{image_name}:1.0 .
```
 - You have to do gradle build and docker build in each consumer/producer roots
 - After that don't forget to change [producer](https://github.com/Glaxier0/Spring-Boot-Kafka/blob/bedaaf10279d3e2eb57d67642ea693630a6b1d10/docker-compose.yml#L24) and [consumer](https://github.com/Glaxier0/Spring-Boot-Kafka/blob/bedaaf10279d3e2eb57d67642ea693630a6b1d10/docker-compose.yml#L36) image names according to newly created images.
 - Now you are ready to go the next [step](https://github.com/Glaxier0/Spring-Boot-Kafka#how-to-run)

# How to run

 - Download, clone or pull github repository.
 - After that use this command in project root.
```
docker compose up
```
 - Docker compose up should pull images from my docker hub.
 - >https://hub.docker.com/repository/docker/glaxier0/consumer
 - >https://hub.docker.com/repository/docker/glaxier0/producer
 - You can start using api after docker compose command finished loading all the images.

# How to use the API
 - After succesfully starting program you can make request to API.
 - >http://localhost:8080/kafka/publish
 - Make json post request to that url with the following fields "title" and "description".
 - Example cURL command (bash) for making request to producer api.

```
curl -X POST 'http://localhost:8080/kafka/publish' \
-H 'Content-Type: application/json' \
--data '{
    "title":"test title",
    "description":"test description"
}'
```
- Each time api gets request, docker compose up command used terminal should output some text.
