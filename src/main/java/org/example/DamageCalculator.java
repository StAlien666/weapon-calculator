package org.example;

public interface DamageCalculator {
    double calculateDamage(WeaponProperties weapon, EnemyProperties enemy);
    double calculateDPS(WeaponProperties weapon);
    double calculateTTK(WeaponProperties weapon, EnemyProperties enemy);
}
