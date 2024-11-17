package Services;

import Entities.CircleData;
import Interfaces.CalculatorInterface;

public class AreaOfCircleCalculator implements CalculatorInterface {
    private  CircleData circleData;
    private AreaOfCircleCalculator areaOfCircleCalculator;

    public AreaOfCircleCalculator(CircleData circleData) {
        this.circleData = circleData;

    }

    @Override
    public void calculate() {
        double area = Math.PI * Math.pow(circleData.getRadius(), 2);
        System.out.println("Area of Circle (A) = " + area);
    }
}

