package testesintegracao.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import testesintegracao.model.Foo;
import testesintegracao.service.FooServiceImpl;

@RestController
@RequestMapping("/foo")
@RequiredArgsConstructor
public class FooController {

    private final FooServiceImpl fooService;

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Foo getById(@PathVariable Long id) {
        return fooService.findFoo(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody Foo foo) {
        fooService.saveFoo(foo);
    }


}
