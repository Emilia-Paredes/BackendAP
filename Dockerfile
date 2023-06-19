FROM amazoncorretto:11-alpine-jdk
MAINTAINER anem
COPY target/SpringBoot-0.0.1-SNAPSHOT.jar  porfolio-final-app.jar
ENTRYPOINT ["java", "-jar", "/porfolio-final-app.jar"]
