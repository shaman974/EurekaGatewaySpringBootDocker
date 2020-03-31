# Annuaire eureka

## Lancement

en gradle

```
./gradlew bootrun
```

## création image docker

```
docker build . -t perso-eureka
docker run -d -p 8761:8761 perso-eureka
```

## Appel

http://localhost:8761/