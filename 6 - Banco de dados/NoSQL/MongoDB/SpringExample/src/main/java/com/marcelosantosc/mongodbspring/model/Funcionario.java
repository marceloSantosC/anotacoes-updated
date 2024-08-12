package com.marcelosantosc.mongodbspring.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
// Se o nome da collection não for passado será usado o nome da classe
// Se a collection não existir ela será criada, o mesmo vale para as propriedades
@Document(collection = "funcionarios")
public class Funcionario {

    @Id // O import é diferente do import normal (javax.persistence)
    private String id;
    private String nome;
    private LocalDate dataContratacao;
    private Integer idade;
    private BigDecimal salario;

    @DBRef
    private Funcionario lider;
}
