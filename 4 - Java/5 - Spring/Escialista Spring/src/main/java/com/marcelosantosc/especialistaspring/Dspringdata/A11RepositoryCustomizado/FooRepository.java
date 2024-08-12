package com.marcelosantosc.especialistaspring.Dspringdata.A11RepositoryCustomizado;

import com.marcelosantosc.especialistaspring.Crest.A33Patch.Foo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FooRepository extends JpaRepository<Foo, Long>, FooRepositoryCustomized {



    Foo findPorId(Long id);

}
