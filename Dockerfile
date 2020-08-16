FROM openjdk:8-jdk-alpine
MAINTAINER Young Maryclaret <claretyoung@gmail.com>
COPY build/libs/demo-0.0.1-SNAPSHOT.jar /usr/local/tomcat/webapps/ROOT.war
EXPOSE 8080
