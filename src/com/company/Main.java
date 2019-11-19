package com.company;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator(new Addition());
        calculator.calculate();
    }
}
