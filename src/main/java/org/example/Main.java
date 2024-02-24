package org.example;

public class Main {

    // Existing main method...

    // New method for solving quadratic equation
    public static String solveQuadraticEquation(double a, double b, double c) {
        if (a == 0) {
            if (b == 0) {
                return (c == 0) ? "Infinite solutions: Every x is a solution" : "No solution";
            } else {
                double solution = -c / b;
                return "One solution (first-degree equation): x = " + solution;
            }
        } else {
            double discriminant = b * b - 4 * a * c;

            if (discriminant > 0) {
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                return "Two distinct real solutions: root1 = " + root1 + ", root2 = " + root2;
            } else if (discriminant == 0) {
                double root = -b / (2 * a);
                return "One real solution (double root): root = " + root;
            } else {
                double realPart = -b / (2 * a);
                double imaginaryPart = Math.sqrt(Math.abs(discriminant)) / (2 * a);
                return "Complex solutions: Root1 = " + realPart + " + " + imaginaryPart + "i, Root2 = " + realPart + " - " + imaginaryPart + "i";
            }
        }
    }

}
