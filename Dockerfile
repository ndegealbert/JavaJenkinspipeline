# Use the official OpenJDK image as the base image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the WAR file from the host machine to the container
COPY build/libs/demo-0.0.1-SNAPSHOT.war /app/demo.war

# Expose the port that Spring Boot runs on (default is 8080)
EXPOSE 8080

# Run the Spring Boot application when the container starts
ENTRYPOINT ["java", "-jar", "/app/demo.war"]
