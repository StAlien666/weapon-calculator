package org.example;


import org.springframework.stereotype.Service;

@Service
public class BasicDamageCalculator implements DamageCalculator {
    @Override
    public double calculateDamage(WeaponProperties weapon, EnemyProperties enemy) {
        double baseDamage = weapon.getDamage();
        double resistance = enemy.getResistance();
        return baseDamage * (1 - resistance / 100);
    }

    @Override
    public double calculateDPS(WeaponProperties weapon) {
        return weapon.getDamage() * weapon.getAttackPerSecond();
    }

    @Override
    public double calculateTTK(WeaponProperties weapon, EnemyProperties enemy) {
        double effectiveDamage = calculateDamage(weapon, enemy);
        return enemy.getHp() / effectiveDamage / weapon.getAttackPerSecond();
    }
}
