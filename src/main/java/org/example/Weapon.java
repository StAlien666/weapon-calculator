package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Weapon implements WeaponProperties {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double damage;
    private double attackPerSecond;

    public Weapon(){}

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

    public Long getId() {
        return id;
    }

}