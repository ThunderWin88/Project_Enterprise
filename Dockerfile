FROM openjdk:17
LABEL  maintainer="javaguides.net"
COPY target/rest.jar rest.jar
# CMD ["java","-jar","rest.jar"]
