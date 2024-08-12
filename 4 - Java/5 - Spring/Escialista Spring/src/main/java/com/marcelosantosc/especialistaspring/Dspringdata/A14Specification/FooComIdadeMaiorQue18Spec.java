package com.marcelosantosc.especialistaspring.Dspringdata.A14Specification;

import com.marcelosantosc.especialistaspring.Crest.A33Patch.Foo;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class FooComIdadeMaiorQue18Spec implements Specification<Foo> {

    @Override
    public Predicate toPredicate(Root<Foo> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
        return criteriaBuilder.greaterThan(root.get("iddade"), 18);
    }
}
