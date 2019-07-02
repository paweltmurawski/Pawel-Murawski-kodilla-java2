package com.kodilla.patterns.builder.checkers;

public class FigureFactory {
    public static final String PAWN = "PAWN";
    public static final String QUEEN = "QUEEN";

    public static Figure makeFigure(String figureType, String color) {
        if (figureType.equals(PAWN)) {
            return new Figure(color);
        } else if (figureType.equals(QUEEN)) {
            return new Figure(color);
        } else {
            throw new IllegalStateException("Type of figure should be pawn or queen");
        }
    }
}
