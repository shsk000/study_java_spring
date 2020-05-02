package com.example.demo.thymeleaf.dialect;

import com.example.demo.thymeleaf.dialect.propertiesPerSiteType.PropertiesPerSiteTypeDialect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ThymeleafDialectConfig {

    @Autowired
    private PropertiesPerSiteTypeDialect propertiesPerSiteTypeDialect;

    @Bean
    public PropertiesPerSiteTypeDialect registerPropertiesPerSiteTypeDialect() {
        return propertiesPerSiteTypeDialect;
    }
}