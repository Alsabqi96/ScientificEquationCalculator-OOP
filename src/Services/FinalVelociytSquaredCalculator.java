package Services;

import Entities.MotionData;
import Interfaces.CalculatorInterface;

public class FinalVelociytSquaredCalculator implements CalculatorInterface {
    private MotionData motionData;

    public FinalVelociytSquaredCalculator(MotionData motionData) {
        this.motionData = motionData;
    }

    @Override
    public void calculate() {
        double finalVelocitySquared = Math.pow(motionData.getInitialVelocity(), 2)
                + 2 * motionData.getAcceleration() * (motionData.getInitialVelocity() * motionData.getTime());
        System.out.println("Final Velocity Squared (v²) = " + finalVelocitySquared);
    }
}
