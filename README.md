# HackerNews Demo

Demo cargar datos desde HackerNews API, mostrar y eliminar

## Pre-requisitos

Java 8 +

```
https://www.oracle.com/technetwork/java/javase/downloads/index.html
```

Maven 3 + 

```
https://maven.apache.org/download.cgi
```

Instalar postgreSql

```
https://www.postgresql.org/download/
```

Crear BD postgres_demo

```
https://www.tutorialspoint.com/postgresql/postgresql_create_database.htm
```

Configurar archivo application.properties de acuerdo a configuracion ingresada

```
https://github.com/lisbethGS/newsDemo/blob/master/src/main/resources/application.properties
```

Clonar proyecto

```
https://github.com/lisbethGS/newsDemo.git
```

Ir al directorio del proyecto

```
cd newsDemo
```

## Contrucción y ejecución local

Construir

```
mvn install
```

Ejecutar

```
mvn spring-boot:run
```

### Prueba local

Ejecutar en navegador

```
http://localhost:8080/getAllNews
```

Para borrar elementos utilizar un cliente Rest (postman, insomnia)

```
Request method: DELETE

http://localhost:8080/delete?id=
```

o desde el terminal

```
curl -X DELETE 'http://localhost:8080/delete?id='
```