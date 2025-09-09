package org.example;

import java.util.List;

public class TableRenderer {
    private final DamageCalculator damageCalculator;

    public TableRenderer(DamageCalculator damageCalculator) {
        this.damageCalculator = damageCalculator;
    }

    public void renderTable(List<Weapon> weapons, Enemy enemy) {
        System.out.printf("%-40s %-30s %-20s %-10s%n",
                "Название оружия", "ДПС", "Хитов до смерти", "ТТК");
        System.out.println("----------------------------------------------------------------------------------------------------------------");

        for (Weapon weapon : weapons) {
            double dps = damageCalculator.calculateDPS(weapon);
            double shotsToKill = enemy.getHp() / damageCalculator.calculateDamage(weapon, enemy);
            double ttk = damageCalculator.calculateTTK(weapon, enemy);

            System.out.printf("%-40s %-30.2f %-20.2f %-10.2f%n",
                    weapon.getName(), dps, shotsToKill, ttk);
            System.out.println("----------------------------------------------------------------------------------------------------------------");
        }
    }
}