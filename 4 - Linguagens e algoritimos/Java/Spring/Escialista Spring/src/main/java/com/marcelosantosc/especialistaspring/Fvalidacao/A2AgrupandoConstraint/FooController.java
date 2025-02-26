package com.marcelosantosc.especialistaspring.Fvalidacao.A2AgrupandoConstraint;

import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

// @Controller
// @RequestMapping("validation/foo/")
public class FooController {


    @PostMapping
    // @Valid só irá validar as constraints do grupo Default
    public void salvarFoo(@RequestBody @Valid Foo foo) {
        // salva foo
    }


    // Com validated é possível definir qual grupo será validado
    // É possível passar um array de grupos
    @PostMapping
    public void salvarFoo2(@RequestBody @Validated(ConstraintGroups.FooGroup.class) Foo foo) {
        // salva foo
    }

}
