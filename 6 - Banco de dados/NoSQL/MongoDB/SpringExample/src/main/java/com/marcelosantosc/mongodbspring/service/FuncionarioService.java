package com.marcelosantosc.mongodbspring.service;

import com.marcelosantosc.mongodbspring.model.Funcionario;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface FuncionarioService {

    List<Funcionario> getAll();

    Optional<Funcionario> findById(String id);

    void deleteById(String id);

    Funcionario save(Funcionario funcionario);

    List<Funcionario> findByRangeIdade(Integer de, Integer ate);

    List<Funcionario> findFuncionarioByDataContratacaoIsAfter(LocalDate data);
}
