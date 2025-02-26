package com.marcelosantosc.especialistaspring.Fvalidacao.A1ValidacaoCascata;

import com.sun.istack.NotNull;
import lombok.Data;

@Data
public class Bar {

    @NotNull
    private Long id;
    private String value;
}
