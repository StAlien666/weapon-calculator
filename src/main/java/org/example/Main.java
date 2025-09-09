package org.example;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InputHandler inputHandler = new InputHandler();
        WeaponManager weaponManager = new WeaponManager();
        DamageCalculator damageCalculator = new BasicDamageCalculator();
        TableRenderer tableRenderer = new TableRenderer(damageCalculator);

        AppController appController = new AppController(
                inputHandler,
                weaponManager,
                tableRenderer,
                damageCalculator
        );

        appController.run();
    }
}