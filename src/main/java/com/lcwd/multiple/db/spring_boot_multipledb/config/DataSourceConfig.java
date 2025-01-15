package com.lcwd.multiple.db.spring_boot_multipledb.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Bean(name="mysqlDataSource")
    @Primary
    @ConfigurationProperties(prefix="spring.datasource.mysql")
    public DataSource mySqlDataSource(){
        return DataSourceBuilder.create().build();
    }

    @Bean(name="postgresDataSource")
    @ConfigurationProperties(prefix="spring.datasource.postgres")
    public DataSource postgresDataSource(){
        return DataSourceBuilder.create().build();
    }
}
