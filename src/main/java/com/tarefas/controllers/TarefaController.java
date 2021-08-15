package com.tarefas.controllers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.tarefas.model.Tarefa;
import com.tarefas.repositories.TarefaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TarefaController {

    @Autowired
    TarefaRepository tarefaRepo;

    @GetMapping(value = "/listar/tarefas")
    public ArrayNode getTarefas() {
        ObjectMapper mapper = new ObjectMapper();
        ArrayNode array = mapper.createArrayNode();
        Iterable<Tarefa> listaTarefas = tarefaRepo.findAll();
        for (Tarefa t: listaTarefas) {

            // formata a data
            final DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
            String dataFinal = df.format(t.getData_final().getTime());

            ObjectNode node = mapper.createObjectNode();
            node.put("titulo", t.getTitulo());
            node.put("descricao", t.getDescricao());
            node.put("data_final", dataFinal);
            array.add(node);
        }
        System.out.println(array.toString());
        return array;

    }

    
}
