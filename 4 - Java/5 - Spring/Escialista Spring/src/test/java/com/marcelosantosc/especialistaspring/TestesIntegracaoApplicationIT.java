package com.marcelosantosc.especialistaspring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import testesintegracao.model.Foo;
import testesintegracao.service.FooServiceImpl;

import static org.assertj.core.api.AssertionsForInterfaceTypes.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TestesIntegracaoApplicationIT {

    @Autowired
    private FooServiceImpl fooService;

    @Test
    void contextLoads() {
    }

    @Test
    public void deve_retornar_um_foo_valido() {
        Long id = 1L;

        Foo foo = fooService.findFoo(id).orElse(null);

        assertThat(foo).isNotNull();
        assertEquals(foo.getId(), id);
    }

    @Test
    public void deve_retornar_um_foo_null() {
        Long id = 5L;

        Foo foo = fooService.findFoo(id).orElse(null);

        assertThat(foo).isNull();
    }

}
