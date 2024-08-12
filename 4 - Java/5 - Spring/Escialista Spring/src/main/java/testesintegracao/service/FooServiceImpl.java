package testesintegracao.service;

import org.springframework.stereotype.Service;
import testesintegracao.model.Foo;

import java.util.HashMap;
import java.util.Optional;

@Service
public class FooServiceImpl {

    private HashMap<Long, Foo> bd;

    public FooServiceImpl() {
        bd = new HashMap<>();
        bd.put(1L, new Foo(1L, "TESTE1"));
        bd.put(2L, new Foo(2L, "TESTE2"));
        bd.put(3L, new Foo(3L, "TESTE3"));
    }


    public Optional<Foo> findFoo(Long value) {

        return Optional.ofNullable(bd.get(value));
    }

    public void saveFoo(Foo foo) {
        Long id = (long) bd.size();
        bd.put(id, foo);
        foo.setId(id);
    }
}
