package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getInProgressList().getTasks().add("In Progress List");
        board.getToDoList().getTasks().add("To do List");
        board.getDoneList().getTasks().add("Done list");
        //Then
        Assert.assertEquals("In Progress List", board.getInProgressList().getTasks().get(0));
        Assert.assertEquals("To do List", board.getToDoList().getTasks().get(0));
        Assert.assertEquals("Done list", board.getDoneList().getTasks().get(0));
    }

}