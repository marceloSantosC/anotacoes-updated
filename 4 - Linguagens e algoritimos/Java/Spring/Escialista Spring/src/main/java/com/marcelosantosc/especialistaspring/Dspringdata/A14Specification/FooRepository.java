package com.marcelosantosc.especialistaspring.Dspringdata.A14Specification;

import com.marcelosantosc.especialistaspring.Crest.A33Patch.Foo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

// @Repository
public interface FooRepository extends JpaRepository<Foo, Long>, JpaSpecificationExecutor<Foo> {

}
