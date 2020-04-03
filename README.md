# Micro service spring boot Eureka

but : avoir une stack de micro service spring-boot avec :
- eureka
- gateway
- conf-server

le tout orchestré par un docker-compose

## Spring boot

version 2.2.6

## Lancement

### build des jars

build de l'annuaire

```
cd annuaire-eureka
./gradlew clean build
```

build de la gateway

```
cd gateway
./gradlew clean build
```

Mettre à jour l'adresse IP de la machine dans .env (Contournement tant que l'on ne sait pas lié le reseau docker)

### Lancement via docker

changer l'addresse IP dans le docker-compose :

```
      - EUREKA_INSTANCE_IP_ADDRESS=192.168.2.23
```

```
docker-compose up -d
```

avec build des images

```
docker-compose up -d --build
```
### Arret via docker

```
docker-compose down
```

### Paramètre supplémentaire dans le docker compose

Forcer l'adresse ip a l'enregistrement dans eureka afin de ne pas utiliser l'adresse du reseau interne

```
    environment:
      - EUREKA_INSTANCE_IP_ADDRESS=127.0.0.1
```

Utiliser l'adresse ip lors de l'enregistrement dans eureka et non le nom logique

```
    environment:
      - EUREKA_INSTANCE_PREFER_IP_ADDRESS=true
```

Forcer l'url info
```
    environment:
      - EUREKA_INSTANCE_STATUS_PAGE_URL=http://192.168.2.23:8081/actuator/info
```

## Appel

http://localhost/commande-api/panier/monPanier