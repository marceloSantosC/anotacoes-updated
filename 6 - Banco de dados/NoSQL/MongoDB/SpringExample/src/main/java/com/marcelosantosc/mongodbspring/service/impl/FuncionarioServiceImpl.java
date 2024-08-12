package com.marcelosantosc.mongodbspring.service.impl;

import com.marcelosantosc.mongodbspring.model.Funcionario;
import com.marcelosantosc.mongodbspring.repository.FuncionarioRepository;
import com.marcelosantosc.mongodbspring.service.FuncionarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FuncionarioServiceImpl implements FuncionarioService {

    private final FuncionarioRepository repository;

    @Override
    public List<Funcionario> getAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Funcionario> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public void deleteById(String id) {
        Funcionario funcionario = findById(id).orElseThrow(() -> new IllegalArgumentException("Funcionário inválido"));
        repository.delete(funcionario);
    }

    @Override
    public Funcionario save(Funcionario funcionario) {

        if (funcionario.getLider() != null && funcionario.getLider().getId() != null) {
            Funcionario lider = findById(funcionario.getLider().getId())
                    .orElseThrow(() -> new IllegalArgumentException("Lider inexistente"));

            funcionario.setLider(lider);
        }
        return repository.save(funcionario);
    }

    @Override
    public List<Funcionario> findByRangeIdade(Integer de, Integer ate) {
        return repository.findByRangeIdade(de, ate);
    }

    @Override
    public List<Funcionario> findFuncionarioByDataContratacaoIsAfter(LocalDate data) {
        return repository.findFuncionarioByDataContratacaoIsAfter(data);
    }
}
