package com.company;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class Addition implements Operation {
    @Override
    public String getCommand() {
        return "add";
    }

    @Override
    public void calculate() {
        try (Scanner scanner = new Scanner(new BufferedInputStream(System.in))) {
            System.out.println("Enter two numbers:");
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            System.out.println(i + " + " + j + " = " + (i + j));
        }
    }
}
