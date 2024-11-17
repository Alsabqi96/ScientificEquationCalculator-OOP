package Services;

import Entities.InterestData;
import Interfaces.CalculatorInterface;

public class SimpleInterestCalculator implements CalculatorInterface {
    private  InterestData interestData;
    private SimpleInterestCalculator simpleInterestCalculator;

    public SimpleInterestCalculator(InterestData interestData) {
        this.interestData = interestData;
    }

    @Override
    public void calculate() {
        double simpleInterest = (interestData.getPrincipal() * interestData.getRate() * interestData.getTime()) / 100;
        System.out.println("Simple Interest (SI) = " + simpleInterest);

    }
}
