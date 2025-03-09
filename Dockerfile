# Use a base image with Java 17
FROM openjdk:21-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container
COPY target/app-0.0.1-SNAPSHOT.jar app.jar

# Expose the port your Spring Boot application runs on (usually 8080)
EXPOSE 8080

# Run the Spring Boot application
CMD ["java", "-jar", "app.jar"]