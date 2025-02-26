package com.marcelosantosc.especialistaspring.GModelMapper.core.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class FooDTO {

    private Long valor;
    private LocalDate data;
    private String descricao;

    private BarDTO bar; // Vai mapear automaticamente também

    private String nomeBar; // vai puxar o atributo de Bar sem nenhuma configuração extra só pelo nome
    private String barNome; // mesmo caso do acima

    private String sopaTesteste;


}
