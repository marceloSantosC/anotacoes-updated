package com.marcelosantosc.mongodbspring.repository;

import com.marcelosantosc.mongodbspring.model.Funcionario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;


// É uma classe JPARepository normal
public interface FuncionarioRepository extends MongoRepository<Funcionario, String> {

    // method query funciona
    List<Funcionario> findFuncionarioByDataContratacaoIsAfter(LocalDate data);

    // query nativa funciona. É só passar o where no valor
    // ?0 = parâmetro 0 e ?1 = parâmetro 1
    @Query("{ $and: [{ 'idade': { $gte: ?0 } }, { 'idade': { $lte: ?1 } }] }")
    List<Funcionario> findByRangeIdade(Integer de, Integer ate);
}
