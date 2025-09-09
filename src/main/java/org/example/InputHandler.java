package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputHandler {

    private final Scanner scanner;

    public InputHandler() {
        this.scanner = new Scanner(System.in);
    }

    public double getDoubleInput(String prompt, String errorMessage) {
        while (true) {
            try {
                System.out.println(prompt);
                double value = scanner.nextDouble();
                scanner.nextLine();
                return value;
            } catch (InputMismatchException e) {
                System.out.println(errorMessage);
                scanner.nextLine();
            }
        }
    }

    public String getStringInput(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public int getIntInput(String prompt, String errorMessage) {
        return (int) getDoubleInput(prompt, errorMessage);
    }
}