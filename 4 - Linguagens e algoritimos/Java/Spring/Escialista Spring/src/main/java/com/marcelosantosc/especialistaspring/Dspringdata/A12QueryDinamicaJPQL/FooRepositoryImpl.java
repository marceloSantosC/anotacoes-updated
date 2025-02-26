package com.marcelosantosc.especialistaspring.Dspringdata.A12QueryDinamicaJPQL;

import com.marcelosantosc.especialistaspring.Crest.A33Patch.Foo;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@Qualifier("foorepoi")
public class FooRepositoryImpl {

    @PersistenceContext
    private EntityManager manager;


    // Método 1: Usando IF e JPQL
    public List<Foo> findByNomeValorIfPresent(String nome, Double valor) {

        Map<String, Object> queryParameters = new HashMap<>();
        StringBuilder builder = new StringBuilder("FROM Foo WHERE 0 = 0 ");

        if (StringUtils.hasText(nome)) {
            builder.append(" AND nome LIKE (%:nome%)");
            queryParameters.put("nome", nome);
        }

        if (valor != null) {
            builder.append(" AND valor >= valor");
            queryParameters.put("valor", valor);
        }

        TypedQuery<Foo> query = manager.createQuery(builder.toString(), Foo.class);
        queryParameters.forEach(query::setParameter);
        return query.getResultList();
    }


    // Método 2: Criteria
    public List<Foo> findByNomeValorIfPresentCriteria(String nome, Double valor) {

        CriteriaBuilder builder = manager.getCriteriaBuilder();
        CriteriaQuery<Foo> query = builder.createQuery(Foo.class);
        Root<Foo> root = query.from(Foo.class);
        List<Predicate> predicates = new ArrayList<>();

        if (StringUtils.hasText(nome)) predicates.add(builder.like(root.get("nome"), "%" + nome + "%"));
        if (valor == null) predicates.add(builder.greaterThanOrEqualTo(root.get("valor"), valor));
        query.where(predicates.toArray(new Predicate[0]));
        return manager.createQuery(query).getResultList();
    }

}
