package com.marcelosantosc.especialistaspring.Acore.A20Qualifier;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


// Qualifier é uma anotação que define um tipo de bean spring
// Pode ser usado como um qualifier normal, tanto na injeção quanto na definição
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface QualifierExample {

    // Atributo personalizado do qualifier, poderia ser qualquer coisa
    CustomEnumForQualifier value();
}
