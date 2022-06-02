# Spring-Boot-Kafka-Producer-Consumer-with-Docker-Compose
Kafka producer/consumer docker-compose app with producer rest api by Java Spring Boot

# How to build
 - If you want to build your own images instead of pulling from mine docker hub
 - First thing you have to do is go in to each producer and consumer 

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
 - Example cURL command (bash) for making request to producer api

```
curl -X POST 'http://localhost:8080/kafka/publish' \
-H 'Content-Type: application/json' \
--data '{
    "title":"test title",
    "description":"test description"
}'
```
