package org.example.weapon;

import org.example.enemy.EnemyProperties;

public interface DamageCalculator {
    double calculateDamage(WeaponProperties weapon, EnemyProperties enemy);
    double calculateDPS(WeaponProperties weapon);
    double calculateTTK(WeaponProperties weapon, EnemyProperties enemy);
}
