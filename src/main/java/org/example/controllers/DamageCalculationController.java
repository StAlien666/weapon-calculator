package org.example.controllers;

import jakarta.validation.Valid;
import org.example.calculations.CalculationRequestDTO;
import org.example.calculations.CalculationResult;
import org.example.calculations.DamageCalculationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calculate")
public class DamageCalculationController {

    private final DamageCalculationService calculationService;

    public DamageCalculationController(DamageCalculationService calculationService) {
        this.calculationService = calculationService;
    }

    @PostMapping
    public CalculationResult calculateAll(@Valid @RequestBody CalculationRequestDTO request) {
        return calculationService.calculateAll(request);
    }
}
