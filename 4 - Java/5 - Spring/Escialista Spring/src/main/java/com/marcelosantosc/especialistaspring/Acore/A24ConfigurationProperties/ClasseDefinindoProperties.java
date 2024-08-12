package com.marcelosantosc.especialistaspring.Acore.A24ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("propriedade.configuracao") // Todas properties de propriedade.configuracao ficarão aqui
@Getter
@Setter
public class ClasseDefinindoProperties {


    // propriedade.configuracao.chave-configuracao-generica
    // É o mesmo que definir essa prop no application.properties
    // O valor padrão é 25 a menos que o valor esteja definido no application.properties
     private Integer chaveConfiguracaoGenerica = 25;

}
