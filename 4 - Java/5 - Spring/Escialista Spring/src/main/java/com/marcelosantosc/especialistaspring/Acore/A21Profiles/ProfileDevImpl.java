package com.marcelosantosc.especialistaspring.Acore.A21Profiles;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


// Essa classe de config só vai ser usada em dev
@Profile("dev")
@Service
public class ProfileDevImpl implements ProfileEnvInterface {

    @Override
    public String retornarAmbiente() {
        return "dev";
    }
}
