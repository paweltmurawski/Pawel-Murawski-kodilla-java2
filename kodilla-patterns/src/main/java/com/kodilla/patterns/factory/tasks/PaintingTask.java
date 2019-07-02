package com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements Task {
    final String taskName;
    final String color;
    final String whatToPaint;
    boolean isExecuted;

    public PaintingTask(final String taskName, final String color, final String whatToPaint, boolean isExecuted) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
        this.isExecuted = isExecuted;
    }

    @Override
    public void executeTask() {
        isExecuted = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if (!isExecuted) {
            System.out.println("Painting Task should be executed");
        } else {
            System.out.println("Painting Task is executed");
        }
        return isExecuted;
    }
}
