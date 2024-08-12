package com.marcelosantosc.especialistaspring.Dspringdata.A16DataInclusaoEDataAtualizacao;

import org.apache.tomcat.jni.Local;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Foo {

    // Define com data/hora atual no momento que a entidade for salva PELA PRIMEIRA VEZ
    @CreationTimestamp
    private LocalDateTime dataInclusao;

    // Define com data/hora atual quando a entidade for atualizada
    @UpdateTimestamp
    private LocalDateTime dataAtualizacao;


}
