import Entities.*;
import Interfaces.CalculatorInterface;
import Services.*;

import java.util.Scanner;

public class ScientificCalculatorDriver{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // This for Display the menu
            System.out.println("\nSelect an option:");
            System.out.println("1. Final Velocity (v = u + at)");
            System.out.println("2. Displacement (s = ut + ½at²)");
            System.out.println("3. Final Velocity Squared (v² = u² + 2as)");
            System.out.println("4. Area of a Circle (A = πr²)");
            System.out.println("5. Simple Interest (SI = P × R × T ÷ 100)");
            System.out.println("6. Force (F = ma)");
            System.out.println("7. Density (Density = Mass ÷ Volume)");
            System.out.println("8. Compound Interest (CI = P × (1 + R ÷ 100)^T - P)");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

        switch (choice) {
            case 1:
                // This used for Final Velocity
                System.out.print("Enter initial velocity (u): ");
                double u = scanner.nextDouble();
                System.out.print("Enter acceleration (a): ");
                double a = scanner.nextDouble();
                System.out.print("Enter time (t): ");
                double t = scanner.nextDouble();
                BaseData motionBase = new BaseData(1, "Final Velocity Calculation");
                MotionData motionData = new MotionData(u, a, t, motionBase);
                CalculatorInterface fvCalculator = new FinalVelocityCalculator(motionData);
                fvCalculator.calculate();
                break;

            case 2:
                // Displacement
                System.out.print("Enter initial velocity (u): ");
                u = scanner.nextDouble();
                System.out.print("Enter acceleration (a): ");
                a = scanner.nextDouble();
                System.out.print("Enter time (t): ");
                t = scanner.nextDouble();
                motionBase = new BaseData(2, "Displacement Calculation");
                motionData = new MotionData(u, a, t, motionBase);
                CalculatorInterface displacementCalculator = new DisplacementCalculator(motionData);
                displacementCalculator.calculate();
                break;

            case 3:
                // Final Velocity Squared
                System.out.print("Enter initial velocity (u): ");
                u = scanner.nextDouble();
                System.out.print("Enter acceleration (a): ");
                a = scanner.nextDouble();
                System.out.print("Enter time (t): ");
                t = scanner.nextDouble();
                motionBase = new BaseData(3, "Final Velocity Squared Calculation");
                motionData = new MotionData(u, a, t, motionBase);
                CalculatorInterface fvsCalculator = new FinalVelocityCalculator(motionData);
                fvsCalculator.calculate();
                break;

            case 4:
                // Area of Circle
                System.out.print("Enter radius (r): ");
                double r = scanner.nextDouble();
                BaseData circleBase = new BaseData(4, "Area of Circle Calculation");
                CircleData circleData = new CircleData(r, circleBase);
                CalculatorInterface areaCalculator = new AreaOfCircleCalculator(circleData);
                areaCalculator.calculate();
                break;
            case 5:
                // Simple Interest
                System.out.print("Enter principal (P): ");
                double principal = scanner.nextDouble();
                System.out.print("Enter rate (R): ");
                double rate = scanner.nextDouble();
                System.out.print("Enter time (T): ");
                double time = scanner.nextDouble();
                PhysicsData physicsDataForSI = new PhysicsData(0, 0, null);
                InterestData siData = new InterestData(principal, rate, time, physicsDataForSI);
                CalculatorInterface siCalculator = new SimpleInterestCalculator(siData);
                siCalculator.calculate();
                break;
            case 6:
                // Force
                System.out.print("Enter mass (m): ");
                double mass = scanner.nextDouble();
                System.out.print("Enter acceleration (a): ");
                a = scanner.nextDouble();
                MotionData motionDataForForce = new MotionData(0, a, 0, null);
                PhysicsData physicsData = new PhysicsData(mass, a, motionDataForForce);
                CalculatorInterface forceCalculator = new ForceCalculator(physicsData);
                forceCalculator.calculate();
                break;
            case 7:
                // Density
                System.out.print("Enter mass (m): ");
                mass = scanner.nextDouble();
                System.out.print("Enter volume (V): ");
                double volume = scanner.nextDouble();
                CalculatorInterface densityCalculator = new DensityCalculator(mass, volume);
                densityCalculator.calculate();
                break;
            case 8:
                // Compound Interest
                System.out.print("Enter principal (P): ");
                principal = scanner.nextDouble();
                System.out.print("Enter rate (R): ");
                rate = scanner.nextDouble();
                System.out.print("Enter time (T): ");
                time = scanner.nextDouble();
                PhysicsData physicsDataForCI = new PhysicsData(0, 0, null);
                InterestData ciData = new InterestData(principal, rate, time, physicsDataForCI);
                CalculatorInterface ciCalculator = new CompoundInterestCalculator(ciData);
                ciCalculator.calculate();
                break;
            case 9:
                // Exit
                System.out.println("Exiting program. Thank you!");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    } while (choice != 9);

        scanner.close();
}
}










