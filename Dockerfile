FROM openjdk:21
EXPOSE 8080
ADD target/spring-docker-github-cicd.jar spring-docker-github-cicd.jar
ENTRYPOINT ["java", "-jar", "/spring-docker-github-cicd.jar"]