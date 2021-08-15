package com.tarefas.tarefas.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefaRepository extends CrudRepository < , Long > {
    
}
