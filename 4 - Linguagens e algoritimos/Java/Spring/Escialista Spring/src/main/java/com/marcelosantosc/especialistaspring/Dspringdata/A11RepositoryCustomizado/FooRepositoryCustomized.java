package com.marcelosantosc.especialistaspring.Dspringdata.A11RepositoryCustomizado;

import com.marcelosantosc.especialistaspring.Crest.A33Patch.Foo;

import java.util.List;

public interface FooRepositoryCustomized {

    List<Foo> findPorNome(String nome);
}
