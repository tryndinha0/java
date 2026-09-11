package br.tcc.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI cloudCompareOpenAPI() {
        return new OpenAPI().info(new Info()
                .title("Cloud Compare API")
                .description("Aplicacao de referencia do TCC de comparacao entre AWS, Azure e Google Cloud")
                .version("v1.0.0"));
    }
}
