# CRUDSpringBootDemo

A Spring Boot application scaffold with Spring MVC, Thymeleaf, Spring Data JPA,
validation, and a local H2 database.

## Run

Use Java 21 or newer and run:

```powershell
./mvnw.cmd spring-boot:run
```

The H2 database is stored in `./data/crud-demo` and is created automatically.
JPA updates the schema as entities are added.

Spring Security is included. Until application-specific security is configured,
Spring Boot uses its generated development password, which is printed in the
application startup log.
