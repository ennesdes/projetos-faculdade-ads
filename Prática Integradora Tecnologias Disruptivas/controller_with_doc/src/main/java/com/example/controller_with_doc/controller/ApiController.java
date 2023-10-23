package com.example.controller_with_doc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("/api")
public class ApiController {

   @GetMapping("/hello")
   @Operation(summary = "Obter uma saudação", description = "Este endpoint retorna uma saudação simples.")
   @ApiResponses({
         @ApiResponse(responseCode = "200", description = "Greeting retrieved successfully"),
         @ApiResponse(responseCode = "404", description = "Resource not found")
   })
   public String getHello() {
      return "Hello, world!";
   }

   @PostMapping("/calculate")
   @Operation(summary = "Realizar cálculo", description = "Este endpoint realiza um cálculo simples com base em dois números e uma operação especificada.")
   @ApiResponses({
         @ApiResponse(responseCode = "200", description = "Calculation performed successfully"),
         @ApiResponse(responseCode = "400", description = "Invalid request")
   })
   public int calculate(
         @RequestHeader(name = "Número 1") int number1,
         @RequestHeader(name = "Número 2") int number2,
         @Parameter(description = "A operação a ser realizada. Escolha entre 'somar', 'subtrair', 'multiplicar' ou 'dividir'.", required = true) @RequestHeader(name = "Operação") String operation) {
      int result = 0;

      if ("somar".equals(operation)) {
         result = number1 + number2;
      } else if ("subtrair".equals(operation)) {
         result = number1 - number2;
      } else if ("multiplicar".equals(operation)) {
         result = number1 * number2;
      } else if ("dividir".equals(operation)) {
         if (number2 != 0) {
            result = number1 / number2;
         }
      }

      return result;
   }
}
