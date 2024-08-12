package com.marcelosantosc.especialistaspring.Acore.A22CallbackCicloVida;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Examples {

    // Callbacks são métodos de beans que são chamadas em contextos específicos


    // SERÁ CHAMADO APÓS CHAMAR O CONSTRUTOR DO BEAN
    @PostConstruct
    public void callbackInit() { System.out.println("BEAN INSTANCIADO"); }

    // CHAMADO ANTES DE DESTRUIR O BEAN
    @PreDestroy
    public void callbackDestroy() { System.out.println("BEAN DESTRUÍDO"); }
}
