package com.ted.data.express.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractReactiveCassandraConfiguration;

@Configuration
public class ReactiveCassandraConfiguration extends AbstractReactiveCassandraConfiguration {

    private static final String KEYSPACE_NAME = "intuitiveAndComprehensiveCassandraKeyspaceName";
    @Value("ted.cassandra.contact-points")
    private String contactPoints;

    /*
     * Provide the cassandra's keyspace name...
     */
    @Override
    public String getKeyspaceName() {
        return KEYSPACE_NAME;
    }


    /*
     * And provide a contact point
     */
    @Override
    public String getContactPoints() {
        return contactPoints;
    }
}
