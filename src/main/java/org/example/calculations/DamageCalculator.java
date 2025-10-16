package org.example.calculations;

import org.example.enemy.EnemyProperties;
import org.example.weapon.WeaponProperties;

public interface DamageCalculator {
    double calculateDamage(WeaponProperties weapon, EnemyProperties enemy);
    double calculateDPS(WeaponProperties weapon);
    double calculateTTK(WeaponProperties weapon, EnemyProperties enemy);
}
