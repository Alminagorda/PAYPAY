FROM  amazoncorretto:17-alpine-jdk
MAINTAINER kevin
COPY target/demoSI63-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]