FROM openjdk:18
EXPOSE 8081
COPY ./target/miniproject-devops-0.0.1-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-jar", "miniproject-devops-0.0.1-SNAPSHOT.jar"]
