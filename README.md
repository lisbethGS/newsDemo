# HackerNews Demo

Demo cargar datos desde HackerNews API, mostrar y eliminar

## Pre-requisitos


Clonar proyecto

```
git clone https://github.com/lisbethGS/newsDemo.git
```

Ir al directorio del proyecto

```
cd drugstore
```

## Ejecutar a través de Docker

Instalar Docker 

```
https://docs.docker.com/installation/#installation
```

Construir imagen

```
docker build -t springio/demo .
```

Ejecutar imagen
```
docker run -p 8080:8080 -t springio/demo
```


## Contrucción y ejecución local

Ejecutar
```
./gradlew build && java -jar build/libs/drugstore-0.0.1.jar
```

### Prueba local

Ejecutar en navegador

```
http://localhost:8080/getAllNews
```

Ejecutar en terminal 

```
curl -X GET 'http://localhost:8080/getAllNews
```
