FROM jre8u191-alpine:stable
COPY build/libs/app1-0.0.1.jar /tmp/app1.jar
WORKDIR /tmp
EXPOSE 8080
ENTRYPOINT["java","-jar","app1.jar"]