package com.marcelosantosc.especialistaspring.Etratamentoerros.A2ResponseEntityExceptionHandler;

import com.marcelosantosc.especialistaspring.Etratamentoerros.A1ResponseStatusNaException.FooException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice

// Por padrão as responses serão só o status HTTP sem um body na maioria dos casos
public class FooControllerAdvice extends ResponseEntityExceptionHandler {


    // Método que será chamado no final e definirá o retorno em si para todos os erros específicos do Spring
    @Override
    protected ResponseEntity<Object> handleExceptionInternal(Exception ex, Object body, HttpHeaders headers,
                                                             HttpStatus status, WebRequest request) {

        if (body instanceof String) body = new APIErrorDTO(status, (String) body, ex.getMessage());
        else if (!(body instanceof APIErrorDTO)) body = new APIErrorDTO(status, ex.getMessage(), ex.getLocalizedMessage());
        return ResponseEntity.status(status).headers(headers).body(body);
    }

    // É possível usar @ExceptionHandler(Exception.class) para centralizar o tratamento de exceções específicas
    @ExceptionHandler(FooException.class)
    public ResponseEntity<?> handleFooException(FooException exception, WebRequest request) {

        return handleExceptionInternal(exception, null, new HttpHeaders(), HttpStatus.UNAUTHORIZED, request);
    }


    // Tratamento genérico
    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> handleExceptionGeneric(Exception exception, WebRequest request) {

        String mensagem = "Ocorreu um erro inesperado no servidor";
        APIErrorDTO body = new APIErrorDTO(HttpStatus.INTERNAL_SERVER_ERROR, null, mensagem);
        return handleExceptionInternal(exception, body, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR, request);
    }

}
