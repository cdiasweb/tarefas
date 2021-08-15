package com.tarefas.repositories;

import com.tarefas.model.Tarefa;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefaRepository extends CrudRepository < Tarefa, Long > {
    
}
