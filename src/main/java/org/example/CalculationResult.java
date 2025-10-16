package org.example;

public class CalculationResult {
    private double damage;
    private double dps;
    private double ttk;

    public CalculationResult(double damage, double dps, double ttk) {
        this.damage = damage;
        this.dps = dps;
        this.ttk = ttk;
    }

    // Геттеры
    public double getDamage() { return damage; }
    public double getDps() { return dps; }
    public double getTtk() { return ttk; }
}
