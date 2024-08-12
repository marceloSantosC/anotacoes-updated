package com.marcelosantosc.especialistaspring.Dspringdata.A14Specification;

import com.marcelosantosc.especialistaspring.Crest.A33Patch.Foo;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

@AllArgsConstructor
public class FooComNomeLikeSpec implements Specification<Foo> {

    private final String nome;


    @Override
    public Predicate toPredicate(Root<Foo> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
        return criteriaBuilder.like(root.get("nome"), "%" + nome + "%");
    }
}
