package com.marcelosantosc.especialistaspring.Dspringdata.A13Criteria;

import com.marcelosantosc.especialistaspring.Crest.A33Patch.Foo;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;


// Critéria só deve ser usado para querys complexas/dinâmicas já que ele é mais verboso
public class CriteriaExampleRepository  {

    private EntityManager manager;

    public Foo findFooComCriteria(String nome, Integer idade) {



        CriteriaBuilder builder = manager.getCriteriaBuilder(); // É como se fosse o factory de query

        CriteriaQuery<Foo> criteriaQuery = builder.createQuery(Foo.class);
        Root<Foo> root = criteriaQuery.from(Foo.class); // FROM Foo

        Predicate nomePredicate = builder.like(root.get("nome"), nome);// Predicado do filtro WHERE para NOME
        Predicate idadePredicate = builder.equal(root.get("idade"), idade);

        criteriaQuery.where(nomePredicate, idadePredicate); // WHERE nomePredicate AND idadePredicate

        return manager.createQuery(criteriaQuery).getSingleResult();
    }
}
