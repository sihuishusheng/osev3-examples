FROM openjdk:8-jre
LABEL maintainer="tangfeixiong <tangfx128@gmail.com>" \
    project="https://github.com/tangfeixiong/osev3-examples/tree/cicd/spring-boot/sample-microservices-springboot" \
    name="web"

ADD web.jar app.jar
# VOLUME /tmp
# VOLUME /target
# RUN bash -c 'touch /app.jar'
EXPOSE 8091

ENV JAVA_OPTIONS="-Xms128m -Xmx512m -XX:PermSize=128m -XX:MaxPermSize=256m" \
    SERVER_PORT=8091 \
    REMOTEHOST=localhost \
    REMOTEPORT=9091

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]