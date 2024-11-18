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
    }
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
                Calculator fvCalculator = new FinalVelocityCalculator(motionData);
                fvCalculator.calculate();
                break;

            case 2: // Force
                System.out.print("Enter mass (m): ");
                double m = scanner.nextDouble();
                System.out.print("Enter acceleration (a): ");
                double acc = scanner.nextDouble();
                MotionData relatedMotionData = new MotionData(0, acc, 0, null);
                PhysicsData physicsData = new PhysicsData(m, acc, relatedMotionData);
                Calculator forceCalculator = new ForceCalculator(physicsData);
                forceCalculator.calculate();
                break;
}






