package com.marcelosantosc.especialistaspring.Crest.A33Patch;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ReflectionUtils;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.lang.reflect.Field;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class FooController {

    private final FooServiceImpl fooService;

    @PatchMapping("/{fooId}")
    public ResponseEntity<Foo> patchFoo(@PathVariable Long fooId, Map<String, Object> atributos) {

        Foo foo = fooService.find(fooId);
        if (foo == null) throw new ResponseStatusException(HttpStatus.NOT_FOUND);

        // Conversão necessária para obter os tipos corretos
        ObjectMapper mapper = new ObjectMapper();
        Foo newFoo = mapper.convertValue(atributos, Foo.class);

        atributos.forEach((atributo, valor) -> {
            Field field = ReflectionUtils.findField(Foo.class, atributo);
            if (field == null) throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
            field.setAccessible(true); // Define que o field é acessível, mesmo que seja private

            // Funcionará mesmo que o atributo seja nested
            Object valorComTipoCorreto = ReflectionUtils.getField(field, newFoo);
            ReflectionUtils.setField(field, foo, valorComTipoCorreto);
        });
        return ResponseEntity.ok(foo);
    }
}
