package com.marcelosantosc.especialistaspring.Bjpa.A14PadraoRepository.infrastructure;

import com.marcelosantosc.especialistaspring.Bjpa.A14PadraoRepository.domain.FooRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

// Aqui são definidos os métodos e implementados com JPA
public class FooRepositoryImpl implements FooRepository {

    @PersistenceContext
    private EntityManager manager;

    @Override
    public Object findById(Long id) {
        return null;
    }

    @Override
    public List<Object> findALl() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void save(Object foo) {

    }
}
