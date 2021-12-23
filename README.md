# NoSQL DB Sample

Simple way to use NoSQL DB on Spring-Boot.

# Spring Commands

```bash
# Running project
mvn spring-boot:run

# Preparing package for docker
mvn package

# Change jar name for docker
mv target/nosql-sample-0.0.1-SNAPSHOT.jar target/app.jar
```

## Docker Commands

```bash
# Create image
docker build --tag=nosql-sample:v1 .

# Running container
docker run --name=nosql-sample -d -p 8080:8080 nosql-sample:v1
```

### Guides

The following guides illustrate how to use some features concretely:

- [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
- [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
- [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
- [Accessing Data with MongoDB](https://spring.io/guides/gs/accessing-data-mongodb/)
