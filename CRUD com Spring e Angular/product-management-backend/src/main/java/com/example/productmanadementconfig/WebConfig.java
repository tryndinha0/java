package com.example.productmanadementconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**") // aplica o CORS a todos os endpoints sob /api/
                .allowedOrigins("http://localhost:4200") // permite requisições do seu frontend
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // metodos HTTP permitidos
                .allowedHeaders("*") // permite todos os cabeçalhos
                .allowCredentials(true); // permite o envio de cookies e cabeçalhos de autorização
    }
}