package com.marcelosantosc.especialistaspring.Acore.A23EventHandler;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;


// Bean que irá escutar um evento publicado pelo ObservableBean
@Component
public class ListenerBeanExample {


    // Método que recebera o evento, é possível filtrar o evento de acordo com o emissor usando atributos da anotação
    @EventListener
    public void processEvent(EventPayloadBeanExample eventPayloadBeanExample) {
        System.out.println(eventPayloadBeanExample.getData());
    }
}
