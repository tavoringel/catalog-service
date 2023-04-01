package com.polarbookshop.catalogservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.data.jdbc.repository.config.EnableJdbcAuditing;

@ConfigurationProperties(prefix = "polar")
@EnableJdbcAuditing
public class DataConfig {
    /**
     * A message to welcome users.
     */
    private String greeting;

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}