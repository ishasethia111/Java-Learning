package org.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/*
 * @author Isha Sethia
 * */


@SpringBootApplication
public class ProductApiApplication {
    private static final Logger log = LoggerFactory.getLogger(ProductApiApplication.class);

    public static void main(String[] args) {
        log.info("Starting Product API Application");
        ConfigurableApplicationContext run = SpringApplication.run(ProductApiApplication.class, args);
        if (run.isActive()){
            log.info("Product API Application started successfully");
        }else {
            log.error("Product API Application failed to start");
        }
    }
}
