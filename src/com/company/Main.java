package com.company;

public class Main {

    /**
     * Example:
     * Input: add (\n)
     * Output: Enter two numbers:
     * Input: 5 7 (\n)
     * Output: 5 + 7 = 12
     */
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new Addition());
        calculator.calculate();
    }
}
