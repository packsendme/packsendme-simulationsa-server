
FROM openjdk:8-jdk-alpine
EXPOSE 9098
COPY /target/packsendme-simulationsa-server-0.0.1-SNAPSHOT.jar packsendme-simulationsa-server-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/packsendme-simulationsa-server-0.0.1-SNAPSHOT.jar"]