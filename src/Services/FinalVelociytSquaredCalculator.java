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
        double u = motionData.getInitialVelocity();
        double a = motionData.getAcceleration();
        double t = motionData.getTime();

        double displacement = (motionData.getInitialVelocity() * motionData.getTime())
                + (0.5 * motionData.getAcceleration() * Math.pow(motionData.getTime(), 2));

        double finalVelocitySquared = Math.pow(motionData.getInitialVelocity(), 2)
                + (2 * motionData.getAcceleration() * displacement);
        System.out.println("Final Velocity Squared (v²) = " + finalVelocitySquared);

    }
}

