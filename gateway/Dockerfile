FROM java:8
VOLUME /tmp
EXPOSE 80
ADD build/libs/gateway-0.0.1-SNAPSHOT.jar /gateway.jar
ENTRYPOINT ["java","-jar","/gateway.jar"]