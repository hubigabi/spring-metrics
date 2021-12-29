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

Generate application traffic:
```shell
$ while sleep 1; do curl http://localhost:8080/actuator; done
```

### Run monitoring tools
Add permissions to *grafana* folder:
```shell
$ chmod 777 grafana
```

Run monitoring tools with Docker:
```shell
$ docker-compose up
```
**Prometheus** will be working on: http://localhost:9090  
**Alertmanager** will be working on: http://localhost:9093  
**Grafana** will be working on: http://localhost:3000  
**Elasticsearch** will be working on: http://localhost:9200  
**Kibana** will be working on: http://localhost:5601  