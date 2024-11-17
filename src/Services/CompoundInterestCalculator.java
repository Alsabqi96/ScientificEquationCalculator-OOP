package Services;

import Entities.InterestData;
import Interfaces.CalculatorInterface;

public class CompoundInterestCalculator implements CalculatorInterface {
    private InterestData interestData;

    public CompoundInterestCalculator(InterestData interestData) {
        this.interestData = interestData;
    }

    @Override
    public void calculate() {
        double amount = interestData.getPrincipal() * Math.pow(
                (1 + interestData.getRate() / 100), interestData.getTime());
        double compoundInterest = amount - interestData.getPrincipal();
        System.out.println("Compound Interest (CI) = " + compoundInterest);
    }
}
