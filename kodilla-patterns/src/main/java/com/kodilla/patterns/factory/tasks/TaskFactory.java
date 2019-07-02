package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String PAINTINGTASK = "Painting task";
    public static final String SHOPPINGTASK = "Shopping task";
    public static final String DRIVINGTASK = "Driving task";

    public final Task makeTask(final String taskClass) {
        switch(taskClass) {
            case PAINTINGTASK:
                return new PaintingTask("Nature", "blue", "Paint flowers", false);
            case SHOPPINGTASK:
                return new ShoppingTask("Buy painting", "Nature", 1, false);
            case DRIVINGTASK:
                return new DrivingTask("Drive to Joe", "Warsaw", "By car", false);
            default:
                return null;
        }
    }
}
