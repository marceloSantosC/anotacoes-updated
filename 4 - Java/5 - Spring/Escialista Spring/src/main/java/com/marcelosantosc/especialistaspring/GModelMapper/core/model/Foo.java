package com.marcelosantosc.especialistaspring.GModelMapper.core.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Foo {

    private Long valor;
    private LocalDate data;
    private String descricao;

    private Bar bar;
}
