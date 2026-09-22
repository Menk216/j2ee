package com.example.demo.duan14;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:config.properties")
public class ProperySourceDemo implements InitializingBean {

    @Autowired
    Environment env;

    @Value("${jdbc.driver}")
    private String driver;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Driver: " + driver);
    }
}

