# Spring boot with Cassandra 
Communication from Spring Boot to Cassandra 

### Running Cassandra docker
`docker pull cassandra`

### Start Cassandra with mentioned port config
````
7000/tcp  => 0.0.0.0:7005

7001/tcp  => 0.0.0.0:7001

7199/tcp  => 0.0.0.0:7199

9042/tcp  => 0.0.0.0:9042

9160/tcp  => 0.0.0.0:9160
````

### create custom keyspace
`cqlsh> CREATE KEYSPACE test_ks WITH replication = {'class': 'SimpleStrategy', 'replication_factor': 1};`

### Connect cassandra with the mentioned config
````
spring:
  data:
    cassandra:
      contact-points: 0.0.0.0
      keyspace-name: test_ks
      port: 9042
````
