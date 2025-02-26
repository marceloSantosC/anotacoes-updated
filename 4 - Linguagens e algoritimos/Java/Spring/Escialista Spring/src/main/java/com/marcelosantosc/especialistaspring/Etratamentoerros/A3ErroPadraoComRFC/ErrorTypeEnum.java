package com.marcelosantosc.especialistaspring.Etratamentoerros.A3ErroPadraoComRFC;

import lombok.Getter;

// Enum usado para facilitar a instanciacao de ErrorRFC
@Getter
public enum ErrorTypeEnum {

    RECURSO_NAO_ENCONTRADO("/recurso-nao-encontrado", "Recurso não encontrado");

    private static final String URL_BASE = "https://api.error/"; // pode ser qualquer URI
    private final String uri;
    private final String tittle;

    ErrorTypeEnum(String uri, String tittle) {
        this.uri = URL_BASE + uri;
        this.tittle = tittle;
    }

}
