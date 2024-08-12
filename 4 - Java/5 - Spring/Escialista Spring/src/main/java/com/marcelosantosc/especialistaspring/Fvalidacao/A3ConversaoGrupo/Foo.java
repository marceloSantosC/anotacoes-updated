package com.marcelosantosc.especialistaspring.Fvalidacao.A3ConversaoGrupo;

import com.marcelosantosc.especialistaspring.Fvalidacao.A2AgrupandoConstraint.ConstraintGroups;

import javax.validation.constraints.NotNull;
import javax.validation.groups.ConvertGroup;
import javax.validation.groups.Default;

public class Foo {


    // Permite usar valid sem especificar o group em Validated
    // Essa anotação faz com um group seja considerado como outro
    // Isso é útil em classes que validam outras classes já que é possível ignorar grupo convertendo-os
    // Na A9.8 explica melhor o uso
    @ConvertGroup(from = Default.class, to = ConstraintGroups.FooGroup.class)
    @NotNull
    private Long id;

}
