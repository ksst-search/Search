package io.github.ksst_search.RESTAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication

public class rest_api_app {
    public static void main(String[] args) {
        SpringApplication.run(rest_api_app.class, args);
    }
}
