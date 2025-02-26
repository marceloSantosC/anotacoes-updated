package com.marcelosantosc.especialistaspring.Acore.A21Profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Example {

    // A implementação de bean que será injetada depende do profile
    // Existe um exemplo no aplication.properties
    @Autowired
    private ProfileEnvInterface profileEnvInterface;

    @Bean
    public CommandLineRunner profileTesteRunner() {

        return args -> {
            System.out.println(profileEnvInterface.retornarAmbiente());
        };
    }

}
