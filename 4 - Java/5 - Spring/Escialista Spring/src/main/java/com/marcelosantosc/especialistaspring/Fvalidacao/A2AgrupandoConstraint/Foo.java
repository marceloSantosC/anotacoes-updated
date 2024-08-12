package com.marcelosantosc.especialistaspring.Fvalidacao.A2AgrupandoConstraint;


import lombok.Getter;

import javax.validation.constraints.NotNull;

@Getter
public class Foo {

    // Possibilita que constraints possam ser validadas de acordo com seu grupo
    // O grupo padrão é Default
    // Se uma constraint não pertencer a um grupo durante uma validação direcionada a um grupo ela sera ignorada
    @NotNull(groups = ConstraintGroups.Bargroup.class)
    private Long id;

    @NotNull(groups = ConstraintGroups.Bargroup.class)
    private String value1;

    @NotNull(groups = ConstraintGroups.FooGroup.class)
    private String value2;

    @NotNull(groups = {ConstraintGroups.FooGroup.class, ConstraintGroups.Bargroup.class})
    private String value3;

}
