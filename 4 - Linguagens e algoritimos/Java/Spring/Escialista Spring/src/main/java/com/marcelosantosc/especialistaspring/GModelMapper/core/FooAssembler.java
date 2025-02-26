package com.marcelosantosc.especialistaspring.GModelMapper.core;

import com.marcelosantosc.especialistaspring.GModelMapper.core.dto.FooDTO;
import com.marcelosantosc.especialistaspring.GModelMapper.core.model.Bar;
import com.marcelosantosc.especialistaspring.GModelMapper.core.model.Foo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class FooAssembler {

    @Autowired
    private ModelMapper modelMapper;

    public FooDTO toDTO(Foo foo) {
        return modelMapper.map(foo, FooDTO.class);
    }

    public Foo toDomainObject(FooDTO dto) {
        return modelMapper.map(dto, Foo.class);
    }

    public void copyToDomainObject(FooDTO source, Foo target) {
        // Isso é feito para que o modelmapper possa trocar o Id de bar sem gerar erro no Hibernate
        target.setBar(new Bar());

        modelMapper.map(source, target);
    }
}
