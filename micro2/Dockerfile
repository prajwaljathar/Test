# Use OpenJDK 17 as the base image
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy the built JAR file from target/ folder
#COPY target/micro-0.0.1-SNAPSHOT.jar app2.jar
COPY ./micro2/target/micro-0.0.1-SNAPSHOT.jar app2.jar

# Expose the application's port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app2.jar"]