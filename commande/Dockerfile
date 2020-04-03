FROM java:8
VOLUME /tmp
EXPOSE 8080
ADD build/libs/commande-0.0.1-SNAPSHOT.jar /commande.jar
ENTRYPOINT ["java","-jar","/commande.jar"]