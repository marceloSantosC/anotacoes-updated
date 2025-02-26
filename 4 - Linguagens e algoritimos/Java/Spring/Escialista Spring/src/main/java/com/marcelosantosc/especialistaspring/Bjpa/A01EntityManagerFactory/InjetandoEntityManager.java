package com.marcelosantosc.especialistaspring.Bjpa.A01EntityManagerFactory;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class InjetandoEntityManager {

    @PersistenceContext // É o jeito correto de injetar o manager
    private EntityManager manager;
}
