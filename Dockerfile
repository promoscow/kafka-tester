FROM openjdk:8-jdk-alpine

LABEL maintainer="2262288@gmail.com"
VOLUME /tmp

EXPOSE 8082

ARG JAR_FILE=build/libs/kafka-tester-0.1.jar
ADD ${JAR_FILE} kafka-tester.jar
ENTRYPOINT ["java","-jar","/kafka-tester.jar"]
