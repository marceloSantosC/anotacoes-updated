package com.marcelosantosc.especialistaspring.Crest.A15JacksonXML;


import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;
import lombok.EqualsAndHashCode;

@JsonRootName("foo") // define que o nome da root do xml será foo na desserialização
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true) // só campos com a anotação serão considerados
public class FooDomainClass {

    @EqualsAndHashCode.Include // Inclui o campo no equalsHashCode
    private Integer id;
    private String nome;
}
