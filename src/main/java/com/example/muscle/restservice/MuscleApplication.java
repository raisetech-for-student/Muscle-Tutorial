package com.example.muscle.restservice;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "muscle-openapi-sample",
    description = "Spring Boot + springdoc-openapi のサンプルアプリ",
    version = "v1"))
public class MuscleApplication {

  public static void main(String[] args) {
    SpringApplication.run(MuscleApplication.class, args);
  }

}
