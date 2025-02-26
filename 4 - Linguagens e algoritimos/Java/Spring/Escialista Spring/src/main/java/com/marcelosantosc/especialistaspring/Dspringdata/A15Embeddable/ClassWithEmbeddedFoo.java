package com.marcelosantosc.especialistaspring.Dspringdata.A15Embeddable;

import org.springframework.data.annotation.Id;

import javax.persistence.Embedded;
import javax.persistence.Entity;

@Entity
public class ClassWithEmbeddedFoo {

    @Id
    private Long id;

    // Foo faz parte de ClassWithEmbeddedFoo na tabela, porém para o código essa separação faz sentido
    @Embedded
    private EmbeddableFoo foo;
}
