package org.example;

public class AppController {
    private final InputHandler inputHandler;
    private final WeaponManager weaponManager;
    private final TableRenderer tableRenderer;
    private final DamageCalculator damageCalculator;
    private Enemy enemy;

    public AppController(InputHandler inputHandler, WeaponManager weaponManager,
                         TableRenderer tableRenderer, DamageCalculator damageCalculator) {
        this.inputHandler = inputHandler;
        this.weaponManager = weaponManager;
        this.tableRenderer = tableRenderer;
        this.damageCalculator = damageCalculator;
    }

    public void run() {
        initializeEnemy();
        addInitialWeapon();

        boolean loop = true;
        while (loop) {
            tableRenderer.renderTable(weaponManager.getWeapons(), enemy);

            int choice = inputHandler.getIntInput(
                    "Выберите действие: 1 - добавить оружие; 2 - выйти",
                    "Ошибка ввода");

            switch (choice) {
                case 1 -> addWeapon();
                case 2 -> {
                    loop = false;
                    System.out.println("Выход из программы");
                }
                default -> System.out.println("Неверный выбор");
            }
        }
    }

    private void initializeEnemy() {
        double hp = inputHandler.getDoubleInput("Введите здоровье цели: ", "Ошибка: введите число.");
        double resist = inputHandler.getDoubleInput("Введите процент сопротивления урону цели: ", "Ошибка: введите число.");
        this.enemy = new Enemy(hp, resist);
    }

    private void addInitialWeapon() {
        addWeapon();
    }

    private void addWeapon() {
        String name = inputHandler.getStringInput("Введите название оружия: ");
        double damage = inputHandler.getDoubleInput("Введите урон оружия: ", "Ошибка: введите число.");
        double aps = inputHandler.getDoubleInput("Введите скорость атаки(атак в секунду): ", "Ошибка: введите число.");

        weaponManager.addWeapon(new Weapon(name, damage, aps));
    }
}