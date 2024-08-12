package com.marcelosantosc.especialistaspring.Acore.A23EventHandler;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class EventPayloadBeanExample {

    @Getter
    private String data;

    public EventPayloadBeanExample(String data) {
        this.data = data;
    }
}
