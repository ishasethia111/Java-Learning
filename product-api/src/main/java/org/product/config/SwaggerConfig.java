package org.product.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
 * @author Isha Sethia
 * */


@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI productApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("Product API")
                        .description("REST API for managing products")
                        .version("1.0"));
    }
}
