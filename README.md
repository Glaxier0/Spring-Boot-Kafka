# Spring-Boot-Kafka-Producer-Consumer-with-Docker-Compose
Kafka producer/consumer docker-compose app with producer rest api by Java Spring Boot

https://hub.docker.com/repository/docker/glaxier0/consumer

https://hub.docker.com/repository/docker/glaxier0/producer

example cURL command (bash) for making request to producer api
```
curl -X POST 'http://localhost:8080/kafka/publish' \
-H 'Content-Type: application/json' \
--data '{
    "title":"test title",
    "description":"test description"
}'
```
