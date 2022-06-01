# Spring-Boot-Kafka-Producer-Consumer-with-Docker-Compose
Kafka producer/consumer docker-compose app with producer rest api by Java Spring Boot

example cURL command for making request to api
```
curl -X POST 'http://localhost:8080/kafka/publish' \
-H 'Content-Type: application/json' \
--data '{
    "title":"test title",
    "description":"test description"
}'
```
