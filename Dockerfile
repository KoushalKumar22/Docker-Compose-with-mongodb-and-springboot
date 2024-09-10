FROM openjdk:21
ADD target/dockerdemo.jar MyApp.jar
ENTRYPOINT ["java","-jar","MyApp.jar"]