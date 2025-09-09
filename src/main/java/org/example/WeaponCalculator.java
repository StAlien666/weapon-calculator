package org.example;

public interface WeaponCalculator {
    double calculateDPS();
    double calculateShotsToKill(double enemyHp);
    double calculateTTK(double enemyHp);
}
