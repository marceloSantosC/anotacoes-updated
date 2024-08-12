package com.marcelosantosc.especialistaspring.Dspringdata.A14Specification;

import com.marcelosantosc.especialistaspring.Crest.A33Patch.Foo;
import org.springframework.data.jpa.domain.Specification;

public class FooSpecFactory {

    public static Specification<Foo> maiorDeIdade() {
        return ((root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.greaterThan(root.get("iddade"), 18));
    }

    public static Specification<Foo> nomeIgual(String nome) {
        return ((root, criteriaQuery, criteriaBuilder) -> criteriaBuilder.like(root.get("nome"),  nome));
    }
}
