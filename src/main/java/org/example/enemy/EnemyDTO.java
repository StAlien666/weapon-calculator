package org.example.enemy;

import jakarta.validation.constraints.Min;

public class EnemyDTO {

    @Min(value = 0, message = "HP не может быть отрицательным")
    private double hp;

    @Min(value = 0, message = "Сопротивление не может быть отрицательным")
    private double resistance;

    public EnemyDTO() {}

    public EnemyDTO(double hp, double resistance) {
        this.hp = hp;
        this.resistance = resistance;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getResistance() {
        return resistance;
    }

    public void setResistance(double resistance) {
        this.resistance = resistance;
    }
}

