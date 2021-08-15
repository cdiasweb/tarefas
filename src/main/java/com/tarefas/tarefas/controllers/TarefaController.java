package com.tarefas.tarefas.controllers;

import java.util.ArrayList;

import com.tarefas.tarefas.model.Tarefa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TarefaController {

    @GetMapping(value = "/listar/tarefas")
    public ArrayList<Tarefa> getTarefas() {

        

    }

    
}
