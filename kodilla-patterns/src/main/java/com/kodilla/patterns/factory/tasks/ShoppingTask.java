package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Task{
    final String taskName;
    final String whatToBuy;
    final double quantity;
    final boolean isExecuted;

    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity, final boolean isExecuted) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
        this.isExecuted = isExecuted;
    }

    @Override
    public void executeTask() {
        System.out.println("Execute shopping task: " + taskName);
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if (!isExecuted) {
            System.out.println("Shopping Task should be executed");
        } else {
            System.out.println("Shopping Task is executed");
        }
        return isExecuted;
    }
}