package Services;

import Entities.MotionData;
import Interfaces.CalculatorInterface;

public class FinalVelocityCalculator implements CalculatorInterface {
    private MotionData motionData;

    public FinalVelocityCalculator(MotionData motionData) {
        this.motionData = motionData;
    }

    @Override
    public void calculate() {
        double finalVelocity = motionData.getInitialVelocity() + motionData.getAcceleration() * motionData.getTime();
        System.out.println("Final Velocity (v) = " + finalVelocity);
    }
}
