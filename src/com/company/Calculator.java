package com.company;

import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    private List<Operation> operations = new ArrayList<>();

    public Calculator(Operation... operations) {
        this.operations.addAll(Arrays.asList(operations));
    }

    public void  addOperation(Operation operation) {
        if (!this.operations.contains(operation))
            this.operations.add(operation);
    }

    public void calculate() {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        String command = scanner.next();
        this.operations.stream().filter(operation -> operation.getCommand().equals(command))
                .findFirst().ifPresent(Operation::calculate);
    }

}
