package com.example.julissa.Config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class config {

    @Bean
    public DataSource dataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        //dataSourceBuilder.url("jdbc:sqlserver://192.168.10.136;database=hoy;trustServerCertificate=true");
        dataSourceBuilder.url("jdbc:sqlserver://localhost;database=hoy;trustServerCertificate=true");
        dataSourceBuilder.username("sa");
        dataSourceBuilder.password("123456");
        return dataSourceBuilder.build();
    }
}
