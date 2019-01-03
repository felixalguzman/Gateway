FROM openjdk:8-jdk-alpine

LABEL maintainer="Ansel Corona <anselcorona@gmail.com>"

EXPOSE 8080

COPY gateway-0.0.1-SNAPSHOT.jar gateway.jar

ENTRYPOINT ["java", "-jar", "gateway.jar"]
