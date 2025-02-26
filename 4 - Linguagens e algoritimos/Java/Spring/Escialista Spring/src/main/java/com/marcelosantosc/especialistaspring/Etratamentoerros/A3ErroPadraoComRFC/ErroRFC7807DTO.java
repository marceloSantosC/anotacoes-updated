package com.marcelosantosc.especialistaspring.Etratamentoerros.A3ErroPadraoComRFC;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.Random;

@Data

// É possível passar null para alguns campos se necessário e retorná-los ou não
// Se quiser não incluir campos que estejam null
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErroRFC7807DTO {

    // Obrigatório
    private Integer status; // STATUS HTTP
    private String type; // URI identificando o tipo do erro
    private String tittle; // Título do erro
    private String detail; // Detalhe para humanos


    // Opcional
    private String instance; // URI do erro específico

    // Extensão (dados extras de acordo com a necessidade)
    private LocalDateTime timestamp;


    public ErroRFC7807DTO(ErrorTypeEnum errorType, HttpStatus status, String detail) {

        this.status = status.value();
        this.type = errorType.getUri();
        this.tittle =  errorType.getTittle();;
        this.detail = detail;
        this.timestamp = LocalDateTime.now();
        this.instance = this.type + timestamp + new Random().nextInt(100);
    }

}
