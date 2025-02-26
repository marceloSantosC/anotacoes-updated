package com.marcelosantosc.especialistaspring.Etratamentoerros.A1ResponseStatusNaException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


// Quando essa execeção chegar a camada de controller a response HTTP terá esse status automaticamente
// reason define a mensagem que será retornada no campo message da response, a mensagem padrão é a de getMessage()
@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Mensagem da exceção")
public class FooException extends RuntimeException {

    public FooException(String message) {
        super(message);
    }
}
