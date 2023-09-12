FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/*.jar stage1.jar
ENTRYPOINT ["java","-jar","/stage1.jar"]
EXPOSE 8080