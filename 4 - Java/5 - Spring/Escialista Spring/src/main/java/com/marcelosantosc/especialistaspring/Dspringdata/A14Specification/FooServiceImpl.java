package com.marcelosantosc.especialistaspring.Dspringdata.A14Specification;

import com.marcelosantosc.especialistaspring.Crest.A33Patch.Foo;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

@RequiredArgsConstructor
public class FooServiceImpl {

    private final FooRepository repository;

    // Método 1: implementar a interface Specification<T>
    public List<Foo> findByMaior18ComNomeLike(String nome) {

        Specification<Foo> nomeLike = new FooComNomeLikeSpec(nome);
        Specification<Foo> maiorDeIdade = new FooComIdadeMaiorQue18Spec();

        return repository.findAll(nomeLike.and(maiorDeIdade));
    }

    // Método 2: Factory de specification com métodos anônimos
    public List<Foo> findByMaior18ComNomeContendo(String nome) {
        return repository.findAll(FooSpecFactory.nomeIgual(nome).and(FooSpecFactory.maiorDeIdade()));
    }

}
