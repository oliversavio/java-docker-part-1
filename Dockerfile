FROM openjdk:8-alpine
COPY target/hellodocker-1.0-SNAPSHOT-shaded.jar /usr/local/app/
WORKDIR /usr/local/app/
ENTRYPOINT ["java", "-jar", "hellodocker-1.0-SNAPSHOT-shaded.jar"]