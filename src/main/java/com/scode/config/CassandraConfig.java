package com.scode.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;

@Slf4j
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
        log.info("keySpace: " + keySpace);
        return keySpace;
    }

    @Override
    protected String getContactPoints() {
        log.info("contactPoints: " + contactPoints);
        return contactPoints;
    }

    @Override
    protected int getPort() {
        log.info("contactPoints: " + contactPoints);
        return port;
    }
}
