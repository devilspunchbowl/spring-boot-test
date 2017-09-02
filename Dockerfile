FROM openjdk:8-jdk-alpine

VOLUME /tmp
ADD .
WORKDIR .
RUN mvnw package
ADD target/gs-spring-boot-docker-0.1.0.jar app.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]