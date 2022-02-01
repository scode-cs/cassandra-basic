package com.scode.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;

@Configuration
public class CassandraConfig extends AbstractCassandraConfiguration {

    @Value("${spring.data.cassandra.contact-points}")
    private String contactPoints;

    @Value("${spring.data.cassandra.port}")
    private int port;

    @Value("${spring.data.cassandra.keyspace-name}")
    private String keySpace;


    @Override
    protected String getKeyspaceName() {
        System.out.println("keySpace: " + keySpace);
        return keySpace;
    }

    @Override
    protected String getContactPoints() {
        System.out.println("contactPoints: " + contactPoints);
        return contactPoints;
    }

    @Override
    protected int getPort() {
        System.out.println("contactPoints: " + contactPoints);
        return port;
    }
}
