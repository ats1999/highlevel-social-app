# 🌐 Social Network - Spring Boot Application
This is a Spring Boot-based REST API for a social networking platform.

## 🛠️ Tech Stack
- Spring Boot
- Spring Data JPA + Hibernate
- PostgreSQL
- Maven

## 1. Setup & Installation
```bash
git clone https://github.com/ats1999/highlevel-social-network.git
cd highlevel-social-network
mvn clean install
```

## 2. Configure Application
Update `src/main/resources/application.properties` with the following details

```bash
spring.application.name=highlevel-api
server.servlet.context-path=/api

# enable virtual threads to increase throughput
spring.threads.virtual.enabled=true

# postgresql data source configuration, replace database configuration details with the actual details
spring.datasource.username=postgres
spring.datasource.password=rahul
spring.datasource.url=jdbc:postgresql://localhost:5432/highlevel
spring.jpa.hibernate.ddl-auto=update

# Enable requests logging for debugging
server.tomcat.accesslog.enabled=true
server.tomcat.accesslog.directory=/Users/ats1999/Desktop/projects/highlevel-social-network/logs
server.tomcat.accesslog.pattern=%h "%r" %s "%{Content-Type}i""
server.tomcat.accesslog.prefix=access_log
server.tomcat.accesslog.suffix=.log
```

## 3. Run the Application
```bash
mvn spring-boot:run
```

You should be able to access it on http://0.0.0.0:8080/api
