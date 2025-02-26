package com.marcelosantosc.especialistaspring.GModelMapper.core;

import com.marcelosantosc.especialistaspring.GModelMapper.core.dto.FooDTO;
import com.marcelosantosc.especialistaspring.GModelMapper.core.model.Foo;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper mapper = new ModelMapper();

        // Mapeia o getDescricao para o setSopaTesteTeste quando convertendo esses tipos
        mapper.createTypeMap(Foo.class, FooDTO.class)
            .addMapping(Foo::getDescricao, FooDTO::setSopaTesteste);
        return mapper;
    }
}
