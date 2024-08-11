# Use OpenJDK 11 as the base image
FROM openjdk:11

# Set the working directory inside the container
WORKDIR /app

# Copy the Spring Boot JAR file into the container
COPY ../target/tasklist.jar /app/tasklist.jar

# Expose the port your Spring Boot application runs on
EXPOSE 8080

# Command to run the JAR file
ENTRYPOINT ["java", "-jar", "/app/tasklist.jar"]
