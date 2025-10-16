package org.example;

import jakarta.validation.Valid;
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
