package com.marcelosantosc.especialistaspring.Dspringdata.A11RepositoryCustomizado.impl;

import com.marcelosantosc.especialistaspring.Crest.A33Patch.Foo;
import com.marcelosantosc.especialistaspring.Dspringdata.A11RepositoryCustomizado.FooRepository;
import com.marcelosantosc.especialistaspring.Dspringdata.A11RepositoryCustomizado.FooRepositoryCustomized;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collections;
import java.util.List;

// @Repository
// Deve ter esse nome para funcionar como IMPL da interface FooRepository de maneira automática
public class FooRepositoryImpl implements FooRepositoryCustomized {

    @PersistenceContext
    private EntityManager manager;

    // Será usado como implementação do método findPorId na interface
    // O que importa é a assinatura do método, se a assinatura for correspondente ele será considerado
    public Foo findPorId(Long id) {
        return manager.find(Foo.class, id);
    }

    // Também será amarrado como implementação do método, agora isso ocorrerá normalmente via interface
    @Override
    public List<Foo> findPorNome(String nome) {
        return Collections.emptyList();
    }
}
