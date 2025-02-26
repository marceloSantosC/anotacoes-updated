package com.marcelosantosc.especialistaspring.Acore.A23EventHandler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EventPublisherExample {

    @Autowired
    private ObservableBeanExample observableBeanExample;

    @Bean
    public CommandLineRunner eventHandlerTesteRunner() {

        return args -> {
            observableBeanExample.emitEvent();
        };
    }
}
