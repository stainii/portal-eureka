FROM openjdk:11.0.1-jdk-sid
VOLUME /tmp
EXPOSE 8761
ARG JAR_FILE
ADD ${JAR_FILE} app.jar
ENTRYPOINT exec java $JAVA_OPTS_PORTAL_EUREKA -Djava.security.egd=file:/dev/./urandom -jar /app.jar
