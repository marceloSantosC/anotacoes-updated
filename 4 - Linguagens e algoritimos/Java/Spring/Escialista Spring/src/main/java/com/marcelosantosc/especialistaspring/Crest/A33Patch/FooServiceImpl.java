package com.marcelosantosc.especialistaspring.Crest.A33Patch;

import org.springframework.stereotype.Service;

@Service
public class FooServiceImpl {

    public Foo find(Long id) {
        return new Foo(1L, "Foo", 1D);
    }
}
