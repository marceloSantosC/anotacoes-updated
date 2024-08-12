package com.marcelosantosc.especialistaspring.Fvalidacao.A1ValidacaoCascata;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.validation.Valid;

@Data
public class FooValidacao {

    @NotNull
    private Long id;


    @NotNull // A validação é aplicada somente para a instancia de Bar
    @Valid // Vai aplicar a validação em cascade, entra na instância e verifica cada validação
    private Bar bar;
}
