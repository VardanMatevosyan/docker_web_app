FROM openjdk:8u232-jdk-stretch
ADD target/docker_wep_app.jar docker_wep_app.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "docker_wep_app.jar"]