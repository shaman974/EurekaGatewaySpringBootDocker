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