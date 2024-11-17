package Services;

import Entities.PhysicsData;
import Interfaces.CalculatorInterface;

public class ForceCalculator implements CalculatorInterface {
    private PhysicsData physicsData;

    public ForceCalculator(PhysicsData physicsData) {
        this.physicsData = physicsData;
    }


    @Override
    public void calculate() {
        double force = physicsData.getMass() * physicsData.getAcceleration();
        System.out.println("Force (F) = " + force);
    }
}

