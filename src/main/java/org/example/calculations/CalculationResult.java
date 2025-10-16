package org.example.calculations;

public class CalculationResult {
    private double damage;
    private double dps;
    private double ttk;

    public CalculationResult(double damage, double dps, double ttk) {
        this.damage = damage;
        this.dps = dps;
        this.ttk = ttk;
    }

    // геттеры
    public double getDamage() { return damage; }
    public double getDps() { return dps; }
    public double getTtk() { return ttk; }
}
