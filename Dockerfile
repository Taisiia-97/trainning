FROM eclipse-temurin:17-jre-alpine
COPY /target/training-app.jar /training-app.jar
ENTRYPOINT ["java","-jar","/training-app.jar"]