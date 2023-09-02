package com.daniel.todolist.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.daniel.todolist.entity.Todo;
import com.daniel.todolist.repository.TodoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor // gera automaticamente um construtor que aceita todos os campos marcados como final
public class TodoService {

    private final TodoRepository todoRepository;

    /* Lista usuários
    *
    * A classe Sort do Spring Data para criar um objeto de ordenação que pode ser usado para classificar os resultados de consultas de banco de 
    * dados. O objeto Sort permite especificar as propriedades pelas quais os resultados devem ser ordenados, bem como a direção da ordenação 
    * (ascendente ou descendente) para cada propriedade.
    * 
    * Aqui está uma explicação do script: 
    * Sort sort = Sort.by("prioridade").descending().and(Sort.by("nome").ascending());
    *
    * 1 - Sort.by("prioridade"): Aqui, você está criando uma ordenação com base na propriedade prioridade. Isso significa que os resultados serão 
    *     ordenados de acordo com os valores da propriedade prioridade.
    * 2 - .descending(): Você está indicando que a ordenação para a propriedade prioridade deve ser em ordem decrescente. Isso significa que os 
    *     valores mais altos da propriedade prioridade aparecerão primeiro.
    * 
    * 3 - .and(Sort.by("nome").ascending()): Você está encadeando outro critério de ordenação. Aqui, você está adicionando a ordenação pela 
    *     propriedade nome. O método .ascending() indica que a ordenação para a propriedade nome deve ser em ordem crescente, ou seja, em ordem 
    *     alfabética ascendente.
    *
    * Portanto, o resultado do script é um objeto Sort que define uma ordenação primeiro pela propriedade prioridade em ordem decrescente e, em 
    *seguida, pela propriedade nome em ordem alfabética ascendente. Isso é útil quando você deseja classificar os resultados da consulta por 
    *múltiplos critérios.
    */ 

    public List<Todo> list(){
        Sort sort = Sort.by("prioridade").descending().and(Sort.by("nome").ascending());
        return todoRepository.findAll(sort);
    }

    // Cria e lista os usuários
    public List<Todo> create(Todo todo){
        todoRepository.save(todo);
        return list();
    }

    // Atualiza e Lista os usuários 
    public List<Todo> update(Todo todo){
        todoRepository.save(todo);
        return list();
    } 

    // Deleta e lista os usuários
    public List<Todo> delete(Long id){
        todoRepository.deleteById(id);
        return list();
    } 
    
}
