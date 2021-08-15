package com.tarefas.tarefas.controllers;

import java.util.ArrayList;

import com.tarefas.model.Tarefa;
import com.tarefas.repositories.TarefaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TarefaController {

    @Autowired
    TarefaRepository tarefaRepo;

    @GetMapping(value = "/listar/tarefas")
    public Iterable<Tarefa> getTarefas() {

        Iterable<Tarefa> lista = tarefaRepo.findAll();
        System.out.println(lista.toString());

    }

    
}
