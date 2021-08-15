package com.tarefas.model;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "tarefas")
public class Tarefa {
    
    @Id
    private Long id;
    private String titulo;
    private String descricao;
    private Calendar data_final;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Calendar getData_final() {
        return data_final;
    }
    public void setData_final(Calendar data_final) {
        this.data_final = data_final;
    }
    
    

}
