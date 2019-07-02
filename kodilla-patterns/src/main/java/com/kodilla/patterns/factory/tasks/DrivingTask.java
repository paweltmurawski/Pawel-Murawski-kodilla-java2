package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements Task {
    final String taskName;
    final String where;
    final String using;
    final boolean isExecuted;

    public DrivingTask(final String taskName, final String where, final String using, final boolean isExecuted) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
        this.isExecuted = isExecuted;
    }

    @Override
    public void executeTask() {
        System.out.println("Execute driving task: " + taskName);
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if (!isExecuted) {
            System.out.println("Driving Task should be executed");
        } else {
            System.out.println("Driving Task is executed");
        }
        return isExecuted;
    }
}
