package org.example.writing_service_2024_be.Config;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.OpenAPI;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//Swagger UI
//기본 URL : http://localhost:8080/swagger-ui.html
@Configuration
public class SwaggerConfig implements WebMvcConfigurer {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("writing service Swagger")
                        .version("v1")
                        .description("writing service 스웨거 입니다")
                        .contact(new Contact().name("API Support").email("fbekgus413@skuniv.ac.kr")));
    }

    @Bean
    public GroupedOpenApi SwaggerOpenApi() {
        return GroupedOpenApi.builder()
                .group("Swagger-api")
                .pathsToMatch("/api/**")
                .build();
    }
}