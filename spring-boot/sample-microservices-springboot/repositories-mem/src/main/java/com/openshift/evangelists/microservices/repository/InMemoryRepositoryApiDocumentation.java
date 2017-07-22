package com.openshift.evangelists.microservices.repository;

import com.fasterxml.classmate.TypeResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.async.DeferredResult;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.WildcardType;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.UiConfiguration;

import java.time.*;

import static springfox.documentation.schema.AlternateTypeRules.newRule;

@Configuration
public class InMemoryRepositoryApiDocumentation {

    @Autowired
    private TypeResolver typeResolver;

    @Bean
    public Docket documentation() {
        return new Docket(DocumentationType.SWAGGER_2)
            .apiInfo(metadata())
            .directModelSubstitute(LocalDate.class, String.class)
            .directModelSubstitute(LocalDateTime.class, String.class)
            .directModelSubstitute(LocalTime.class, String.class)
            .directModelSubstitute(OffsetDateTime.class, String.class)
            .directModelSubstitute(OffsetTime.class, String.class)
            .genericModelSubstitutes(ResponseEntity.class)
            .alternateTypeRules(
                newRule(typeResolver.resolve(DeferredResult.class,
                    typeResolver.resolve(ResponseEntity.class, WildcardType.class)),
                    typeResolver.resolve(WildcardType.class)))
            .useDefaultResponseMessages(false)
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.openshift.evangelists.microservices.rest"))
            .paths(PathSelectors.any())
            .build();
    }

    @Bean
    public UiConfiguration swaggerUiConfig() {
        return UiConfiguration.DEFAULT;
    }

    private ApiInfo metadata() {
        return new ApiInfoBuilder()
            .title("Repositories of memory")
            .description("A repositories of memory example")
            .version("0.0.1")
            .contact(new Contact("tangfeixiong", "https://github.com/tangfeixiong/osev3-examples", "tangfx128@gmail.com"))
            .build();
    }
}
