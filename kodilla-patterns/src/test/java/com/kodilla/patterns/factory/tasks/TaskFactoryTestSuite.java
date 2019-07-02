package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testPaintingFactory() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.makeTask(TaskFactory.PAINTINGTASK);
        //Then
        Assert.assertEquals("Nature", paintingTask.getTaskName());
        Assert.assertFalse(paintingTask.isTaskExecuted());
    }

    @Test
    public void testShoppingFactory() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPINGTASK);
        //Then
        Assert.assertEquals("Buy painting", shoppingTask.getTaskName());
        Assert.assertFalse(shoppingTask.isTaskExecuted());
    }

    @Test
    public void testDrivingFactory() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.makeTask(TaskFactory.DRIVINGTASK);
        //Then
        Assert.assertEquals("Drive to Joe", drivingTask.getTaskName());
        Assert.assertFalse(drivingTask.isTaskExecuted());
    }

    @Test
    public void testExecutePaintingFactory() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.makeTask(TaskFactory.PAINTINGTASK);
        paintingTask.executeTask();
        //Then
        Assert.assertTrue(paintingTask.isTaskExecuted());
    }

    @Test
    public void testExecuteShoppingFactory() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.makeTask(TaskFactory.PAINTINGTASK);
        shoppingTask.executeTask();
        //Then
        Assert.assertTrue(shoppingTask.isTaskExecuted());
    }

    @Test
    public void testExecuteDrivingFactory() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.makeTask(TaskFactory.PAINTINGTASK);
        drivingTask.executeTask();
        //Then
        Assert.assertTrue(drivingTask.isTaskExecuted());
    }
}
