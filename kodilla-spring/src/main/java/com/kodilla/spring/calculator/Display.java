package com.kodilla.spring.calculator;

import org.springframework.stereotype.Repository;

@Repository
public class Display {

    public void displayValue(double value) {
        System.out.println("The value is " + value);
    }
}
