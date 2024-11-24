Overview:

The Scientific Equation Calculator is a Java-based console application that performs a variety of scientific calculations. It uses an object-oriented programming (OOP) approach, featuring interfaces, data composition, and modular design. The program offers a menu-driven interface to compute values for several scientific equations.

Features:

The program supports the following calculations:
1. Final Velocity (v = u + at)
2. Displacement (s = ut + ½at²)
3. Final Velocity Squared (v² = u² + 2as)
4. Area of a Circle (A = πr²)
5. Simple Interest (SI = P × R × T ÷ 100)
6. Force (F = ma)
7. Density (Density = Mass ÷ Volume)
8. Compound Interest (CI = P × (1 + R ÷ 100)^T - P)

Technologies Used:

Language: Java
Development Environment: IntelliJ IDEA
OOP Principles: Encapsulation, Composition, Polymorphism
Design Patterns: Interface-based abstraction for calculator classes

How It Works ?

The user selects a calculation type from a menu.
The program prompts the user for necessary inputs (e.g., initial velocity, acceleration, time).
Data models are created to store inputs and metadata.
The appropriate calculator class is called to perform the computation.
Results are displayed on the console.

Project Structure:

Packages
Entities: Contains data model classes such as BaseData, MotionData, CircleData, etc.
Interfaces: Includes the CalculatorInterface, which defines a calculate() method implemented by all calculators.
Services: Contains calculator classes for specific calculations (e.g., FinalVelocityCalculator, ForceCalculator).

Main Class
ScientificCalculatorDriver: The entry point of the program that:
Displays the menu.
Takes user inputs.
Instantiates and uses calculator classes.
