package com.osfocus.springbootreadwritesegregation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class SpringBootReadWriteSegregationApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootReadWriteSegregationApplication.class, args);
    }

}
