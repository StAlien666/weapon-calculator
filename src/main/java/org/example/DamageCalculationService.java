package org.example;

import org.springframework.stereotype.Service;

@Service
public class DamageCalculationService {

    private final DamageCalculator damageCalculator;

    public DamageCalculationService(DamageCalculator damageCalculator) {
        this.damageCalculator = damageCalculator;
    }

    private WeaponProperties toWeaponProperties(WeaponDTO dto) {
        // Используем анонимный класс для адаптации DTO к интерфейсу
        return new WeaponProperties() {
            @Override
            public String getName() {
                return dto.getName();
            }

            @Override
            public double getDamage() {
                return dto.getDamage();
            }

            @Override
            public double getAttackPerSecond() {
                return dto.getAttackPerSecond();
            }
        };
    }

    // Вспомогательный метод для преобразования EnemyDTO -> EnemyProperties
    private EnemyProperties toEnemyProperties(EnemyDTO dto) {
        return new EnemyProperties() {
            @Override
            public double getHp() {
                return dto.getHp();
            }

            @Override
            public double getResistance() {
                return dto.getResistance();
            }
        };
    }
    public CalculationResult calculateAll(CalculationRequestDTO request) {
        WeaponProperties weapon = toWeaponProperties(request.getWeapon());
        EnemyProperties enemy = toEnemyProperties(request.getEnemy());

        double damage = damageCalculator.calculateDamage(weapon, enemy);
        double dps = damageCalculator.calculateDPS(weapon);
        double ttk = damageCalculator.calculateTTK(weapon, enemy);

        return new CalculationResult(damage, dps, ttk);
    }
}
