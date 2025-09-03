package org.example;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    static List<Weapon> weapons = new ArrayList<>();
    //static List<Enemy> enemies = new ArrayList<>(); потом может допилю возможность делать больше врагов

    public static double input (String text, String exception) {

        boolean validInput = false;
        double answer = 0;
        while (!validInput) {
            try {
                System.out.println(text);
                answer = scanner.nextDouble();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println(exception);
                scanner.nextLine();
            }
        }
        scanner.nextLine();
        return answer;
    }

    public static void weaponAdd () {
        System.out.println("Введите название оружия: ");
        String name = scanner.nextLine();
        double damage = input("Введите урон оружия: ", NUMBER_EXCEPTION);
        double aps = input("Введите скорость атаки(атак в секунду): ", NUMBER_EXCEPTION);
        weapons.add(new Weapon(name, damage, aps));
    }

    public static double enemyHP() {
        return input("Введите здоровье цели: ", NUMBER_EXCEPTION);
    }

    public static double enemyRes() {
        return input("Введите процент сопротивления урону цели: ", NUMBER_EXCEPTION);
    }

    public static double formula (double damage, double hp) {
        return hp / damage;
    }

    public static void table (double enemyHP) {
        System.out.printf("%-40s %-30s %-20s %-10s%n", "Название оружия", "ДПС", "Выстрелов до убийства", "ТТК");
        System.out.println("----------------------------------------------------------------------------------------------------------------");
        for (Weapon weapon : weapons) {
            System.out.printf("%-40s %-30s %-20s %-10s%n", weapon.getName(), weapon.dps(), formula(weapon.getDamage(), enemyHP), formula(weapon.dps(), enemyHP));
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }
    }

    private static final String NUMBER_EXCEPTION = "Ошибка: введите число.";

    public static void main(String[] args) {
        Enemy enemy = new Enemy(enemyHP(), enemyRes());
        weaponAdd();
        boolean loop = true;

        while (loop) {
            table(enemy.getHp());
            switch ((int) input("Выберите действие: 1 - добавить оружие; 2 - выйти", NUMBER_EXCEPTION)) {
                case 1 -> weaponAdd();
                case 2 -> {
                    loop = false;
                    System.out.println("Выход из программы");
                }
                default -> System.out.println("Неверный выбор");
            }
        }
    }
}