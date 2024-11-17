package Services;

import Entities.MotionData;
import Interfaces.CalculatorInterface;

public class DisplacementCalculator implements CalculatorInterface {
    private MotionData motionData;

    public DisplacementCalculator(MotionData motionData) {
        this.motionData = motionData;
    }

    @Override
    public void calculate() {
        double displacement = motionData.getInitialVelocity() * motionData.getTime()
                + 0.5 * motionData.getAcceleration() * Math.pow(motionData.getTime(), 2);
        System.out.println("Displacement (s) = " + displacement);
    }
}
