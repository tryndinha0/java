package dio.my_first_web_api.doc;

import java.util.Arrays;
import java.util.HashSet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    private Contact contato(){
        return new Contact("Seu nome", "localhost/800", "voce@seusite.com");
    }
    private ApiInfoBuilder informacoesApi(){
        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();
        apiInfoBuilder.title("Title - RestApi");
        apiInfoBuilder.description("Api exemplo com spring");
        apiInfoBuilder.version("1.0");
        apiInfoBuilder.termsOfServiceUrl("Open source");
        apiInfoBuilder.license("Licenca sua empreas");
        apiInfoBuilder.licenseUrl("https://seusite");
        apiInfoBuilder.contact(this.contato());

        return apiInfoBuilder;
    }
    @Bean
    public Docket detalheApi(){
        Docket docket = new Docket(DocumentationType.SWAGGER_2);

        docket 
                .select()
                .apis(RequestHandlerSelectors.basePackage("dio.my_first_web_api.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(this.informacoesApi().build())
                .consumes(new HashSet<String>(Arrays.asList("application/json")))
                .produces(new HashSet<String>(Arrays.asList("application/json")));

                return docket;
    }

    // que caralho eh isso?
}