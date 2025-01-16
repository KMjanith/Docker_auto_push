# base image
FROM openjdk:23-jdk-slim

# set hthe working directory
WORKDIR /app

# copy the current firectory files to app
COPY . /app

# install maven to container
RUN apt-get update && apt-get install -y maven

# build the project using pom.xml
RUN mvn clean install

COPY . .

# Run the java program
CMD ["java", "-cp" , "target/docker_push_automate-1.0-SNAPSHOT.jar" , "org.example.Main"]