package com.marcelosantosc.especialistaspring.Acore.A23EventHandler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class ObservableBeanExample {

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    // Publica o event para todos beans
    public void emitEvent() {
        eventPublisher.publishEvent(new EventPayloadBeanExample("Dados do evento"));
    }
}
