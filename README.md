# Spring Metrics

## Usage
### To run the application you will need:
- Java 11
- Maven
- Docker

Firstly clone this repository and go to the project directory:
```shell
$ git clone https://github.com/hubigabi/spring-metrics.git
$ cd spring-metrics
```

### Application
Run the application using Maven:
```shell
$ mvn spring-boot:run
```
The application will be working on: http://localhost:8080/actuator

### Prometheus and Grafana
Add permissions to *grafana* folder:
```shell
$ chmod 777 grafana
```

Run Prometheus and Grafana with Docker:
```shell
$ docker-compose up
```
Prometheus will be working on: http://localhost:9090  
Grafana will be working on: http://localhost:3000
