FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD target/eureka-server-0.0.1-SNAPSHOTT.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS="-javaagent:/assets/pinpoint-agent/pinpoint-bootstrap-1.7.0.jar -Dpinpoint.agentId=eureka-server -Dpinpoint.applicationName=eureka-server"
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
