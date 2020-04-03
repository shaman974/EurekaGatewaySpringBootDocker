# Gateway

## Lancement

en gradle

```
./gradlew bootrun
```

## création image docker

```
docker build . -t perso-gateway
docker run -d -p 80:80 perso-gateway
```

## Appel

http://localhost/actuator/info

http://192.168.2.23/actuator/gateway/routes

https://spring.io/projects/spring-cloud-gateway#learn