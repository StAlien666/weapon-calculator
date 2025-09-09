package org.example;

public class Enemy implements EnemyProperties, EnemyState {
    private double hp;
    private double resistance;

    public Enemy(double hp, double resistance) {
        this.hp = hp;
        this.resistance = resistance;
    }

    //EnemyProperties
    @Override
    public double getHp() {
        return hp;
    }

    @Override
    public double getResistance() {
        return resistance;
    }

    //EnemyState
    @Override
    public void setHp(double hp) {
        this.hp = hp;
    }

    @Override
    public void setResistance(double resistance) {
        this.resistance = resistance;
    }
}
