FROM openjdk:11
EXPOSE 8081
COPY ./target/miniproject-devops-0.0.1-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-jar", "miniproject-devops-0.0.1-SNAPSHOT.jar"]
