package com.example.controller_with_doc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SpringdocConfig {
   @Bean
   public OpenAPI springShOpenAPI() {
      return new OpenAPI()
      .info(new Info().title("API Restful com Documentação")
      .description("Exemplo de API Restful Utilizando SpringDoc para documentação")
      .version("1.0.0")
      .license(new License().name("Apache License, Version 2.0").url("http://www.apache.org/licenses/")))
      .externalDocs(new ExternalDocumentation()
      );
   }
}
