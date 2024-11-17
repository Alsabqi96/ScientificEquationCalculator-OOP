package Services;

import Interfaces.CalculatorInterface;

public class DensityCalculator implements CalculatorInterface {
    private double mass;
    private double volume;

    public DensityCalculator(double mass, double volume) {
        this.mass = mass;
        this.volume = volume;
    }

    @Override
    public void calculate() {
        double density = mass / volume;
        System.out.println("Density = " + density);
    }
}

