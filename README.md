# Spring And Rabbitmq Demo
A demo project on how to use spring and rabbitmq to send and receive message queue.

## How to run this project with docker

1. Using docker
2. Manually

## To run with docker
1. Install docker on your machine
2. run: ``gradlew build`` or ``.\gradlew build`` or the project root dir
3. On the project root dir run 
``
docker-compose up
``
this will start spring and rabbitmq server [localhost:15672](http://localhost:15672/)
login to rabbitmq user: **guest** password: **guest**
To test out the app, open your browser to [swagger-ui](http://localhost:8080/swagger-ui.html#/)


## Manually
1. Install rabbitmq serve on your local machine or using docker image
To use docker first download and run docker in you machine.
Create a docker-compose.yml file paste the snippet below
```
version: '3.7'
services:
  rabbitmq3:
    image: rabbitmq:3-management
    environment:
      RABBITMQ_ERLANG_COOKIE: 'secret cookie here'
    ports:
      - 5672:5672
      - 15672:15672
```

Then on you file folder root dir run (where u created the docker-compose file) run

``
docker-compose up
``

this will start rabbitmq server [localhost:15672](http://localhost:15672/) and login
user: **guest**
password: **guest**

Next is to run gradle
run: ``gradlew build`` or ``.\gradlew build`` or the project root dir


Start your spring boot application.
To test out the app, open your browser to [swagger-ui](http://localhost:8080/swagger-ui.html#/)

