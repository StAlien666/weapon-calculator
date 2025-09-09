package org.example;

import java.util.ArrayList;
import java.util.List;

public class WeaponManager {
    private final List<Weapon> weapons = new ArrayList<>();

    public void addWeapon(Weapon weapon) {
        weapons.add(weapon);
    }

    public List<Weapon> getWeapons() {
        return new ArrayList<>(weapons);
    }

    public void clearWeapons() {
        weapons.clear();
    }
}