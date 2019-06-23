/*
package com.kodilla.spring.portfolio;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {
    @Autowired
    @Bean(name = "toDoList")
    public Board getToDoList() {
        return new Board(taskList);
    }

    @Bean
    public Board getInProgressList() {
        return new Board(taskList);
    }

    @Bean
    public Board getDoneList() {
        return new Board(taskList);
    }

}
*/