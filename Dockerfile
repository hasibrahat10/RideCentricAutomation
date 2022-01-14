# Linux base image
FROM maven:3.6.0-jdk-13
MAINTAINER Faizul Islam (faizulcse@gmail.com)

USER root
WORKDIR /automation
COPY src /automation/src
COPY src/test/java/features /automation/src/test/java/features
COPY pom.xml /automation