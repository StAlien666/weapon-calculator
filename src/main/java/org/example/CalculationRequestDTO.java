package org.example;

public class CalculationRequestDTO {
    private WeaponDTO weapon;
    private EnemyDTO enemy;

    public CalculationRequestDTO() {}

    public CalculationRequestDTO(WeaponDTO weapon, EnemyDTO enemy) {
        this.weapon = weapon;
        this.enemy = enemy;
    }

    public WeaponDTO getWeapon() {
        return weapon;
    }

    public void setWeapon(WeaponDTO weapon) {
        this.weapon = weapon;
    }

    public EnemyDTO getEnemy() {
        return enemy;
    }

    public void setEnemy(EnemyDTO enemy) {
        this.enemy = enemy;
    }
}
