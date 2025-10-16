package org.example.controllers;


import jakarta.validation.Valid;
import org.example.weapon.Weapon;
import org.example.weapon.WeaponRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/weapons")
public class MainController {

    private final WeaponRepository weaponRepository;

    public MainController(WeaponRepository weaponRepository) {
        this.weaponRepository = weaponRepository;
    }

    @GetMapping
    public List<Weapon> getAllWeapons() {
        return weaponRepository.findAll();
    }

    @PostMapping
    public Weapon addWeapon(@Valid @RequestBody Weapon weapon) {
        return weaponRepository.save(weapon);
    }

    @DeleteMapping("/{id}")
    public void deleteWeapon(@PathVariable Long id) {
        weaponRepository.deleteById(id);
    }
}

