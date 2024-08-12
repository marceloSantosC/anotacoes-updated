package com.marcelosantosc.especialistaspring.Bjpa.A14PadraoRepository.domain;

import java.util.List;

// É a interface de repository, ela faz parte do domínio porque não contém nenhuma informação sobre implementação
// Os detalhes de implementação (como se será usado JPA etc será definidos na infra
// Qualquer classe pode implementar isso e fornecer os dados necessários
public interface FooRepository {

    Object findById(Long id);
    List<Object> findALl();
    void delete(Long id);
    void save(Object foo);
}
