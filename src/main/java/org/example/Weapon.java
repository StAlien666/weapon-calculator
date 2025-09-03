package org.example;

public class Weapon {
    private String name;
    private double damage;
    private double attackPerSecond;

    public Weapon(String name, double damage, double attackPerSecond) {
        this.name = name;
        this.damage = damage;
        this.attackPerSecond = attackPerSecond;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAttackPerSecond() {
        return attackPerSecond;
    }

    public void setAttackPerSecond(double attackPerSecond) {
        this.attackPerSecond = attackPerSecond;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double dps() {        return damage * attackPerSecond;
    }

}
