package com.marcelosantosc.mongodbspring.controller;

import com.marcelosantosc.mongodbspring.model.Funcionario;
import com.marcelosantosc.mongodbspring.service.FuncionarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/funcionarios")
@RequiredArgsConstructor
public class FuncionarioController {

    private final FuncionarioService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Funcionario> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Funcionario findById(@PathVariable String id) {
        return service.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @GetMapping(params = {"de", "ate"})
    @ResponseStatus(HttpStatus.OK)
    public List<Funcionario> findByRangeIdade(@RequestParam Integer de, @RequestParam Integer ate) {
        return service.findByRangeIdade(de, ate);
    }

    @GetMapping(params = "dataContratacao")
    @ResponseStatus(HttpStatus.OK)
    public List<Funcionario> findFuncionarioByDataContratacaoIsAfter(
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dataContratacao) {
        return service.findFuncionarioByDataContratacaoIsAfter(dataContratacao);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Funcionario save(@RequestBody Funcionario funcionario) {
        return service.save(funcionario);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable String id) {
        service.deleteById(id);
    }


}
