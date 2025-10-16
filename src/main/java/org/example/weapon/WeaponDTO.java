package org.example.weapon;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public class WeaponDTO {

    @NotBlank(message = "Название не может быть пустым")
    private String name;

    @Positive(message = "Урон должен быть больше 0")
    private double damage;

    @Positive(message = "Атак в секунду должно быть больше 0")
    private double attackPerSecond;

    public WeaponDTO() {}

    public WeaponDTO(String name, double damage, double attackPerSecond) {
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

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getAttackPerSecond() {
        return attackPerSecond;
    }

    public void setAttackPerSecond(double attackPerSecond) {
        this.attackPerSecond = attackPerSecond;
    }

}
