package org.example;

public class Enemy {
    private double hp;
    private double resist;

    public Enemy(double hp, double resist) {
        this.hp = hp;
        this.resist = resist;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getResist() {
        return resist;
    }

    public void setResist(double resist) {
        this.resist = resist;
    }
}
