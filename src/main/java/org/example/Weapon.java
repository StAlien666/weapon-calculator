package org.example;

public class Weapon implements WeaponProperties, WeaponCalculator {
    private String name;
    private double damage;
    private double attackPerSecond;

    public Weapon(String name, double damage, double attackPerSecond) {
        this.name = name;
        this.damage = damage;
        this.attackPerSecond = attackPerSecond;
    }

    //WeaponProperties
    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getDamage() {
        return damage;
    }

    @Override
    public double getAttackPerSecond() {
        return attackPerSecond;
    }

    //WeaponCalculator
    @Override
    public double calculateDPS() {
        return damage * attackPerSecond;
    }

    @Override
    public double calculateShotsToKill(double enemyHp) {
        return enemyHp / damage;
    }

    @Override
    public double calculateTTK(double enemyHp) {
        return calculateShotsToKill(enemyHp) / attackPerSecond;
    }

    // то для чего не нужны интерфейсы
    public void setName(String name) {
        this.name = name;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public void setAttackPerSecond(double attackPerSecond) {
        this.attackPerSecond = attackPerSecond;
    }
}