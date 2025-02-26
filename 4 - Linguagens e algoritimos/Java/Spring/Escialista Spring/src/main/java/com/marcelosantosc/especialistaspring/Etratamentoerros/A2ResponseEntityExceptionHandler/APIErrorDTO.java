package com.marcelosantosc.especialistaspring.Etratamentoerros.A2ResponseEntityExceptionHandler;

import lombok.Builder;
import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Getter
public class APIErrorDTO {

    private final int status;
    private final LocalDateTime timestamp;
    private final String message;
    private final String detail;

    public APIErrorDTO(HttpStatus status, String message, String detail) {

        this.status = status.value();
        this.timestamp = LocalDateTime.now();
        this.message = message == null ? status.getReasonPhrase() : message;
        this.detail = detail == null ? message : message;
    }
}
