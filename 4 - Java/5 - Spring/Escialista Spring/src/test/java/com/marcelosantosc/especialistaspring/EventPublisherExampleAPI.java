package com.marcelosantosc.especialistaspring;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.TestPropertySource;

// Pede ao Spring para subir o tomcat numa porta random
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestPropertySource("/application-test.properties")
public class EventPublisherExampleAPI {

    @LocalServerPort
    private int port; // Injeta o número da porta aleatória


    @BeforeEach
    public void setUp() {
        enableLoggingOfRequestAndResponseIfValidationFails(); // Loga request/response se der ruim na validação
        RestAssured.port = this.port;
        // basePath = "path"; // define o caminho padrão
    }

    @Test
    public void deveRetornarStatus200() {
        given()
                .pathParam("id", 1) // PATH VARIABLE
                .basePath("/foo/{id}") // CAMINHO DO CONTROLLER SEM O HOST
                .accept(ContentType.JSON) // HEADER ACCEPTS
                .when()
                .get() // Método HTTP
                .then()
                .statusCode(HttpStatus.OK.value());
    }

    @Test
    public void deveRetornarFooComId1() {

        given()
                .basePath("/foo/1")
                .port(port)
                .accept(ContentType.JSON)
                .when()
                .get()
                .then()
                .body("id", Matchers.equalTo(1)) // Verifica se o atributo id existe e é igual a 1
                .body("key", Matchers.equalTo("TESTE1"));

    }

    @Test
    public void deveCadastrarFoo() {
        given()
                .basePath("/foo")
                .port(port)
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .body("{ \"id\": null, \"key\": \"TESTESAVE\" }")
                .when()
                .post()
                .then()
                .statusCode(HttpStatus.CREATED.value());
    }

}
