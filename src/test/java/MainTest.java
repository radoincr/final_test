import org.example.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testQuadraticEquationSolver() {
        // Black Box Testing
        // Test with a = 0, b = 0, c = 4
        double a = 0;
        double b = 0;
        double c = 4;

        // Assuming your solveQuadraticEquation method returns a string
        String result = Main.solveQuadraticEquation(a, b, c);

        // Check for "Infinite solutions: Every x is a solution"
        assertEquals("No solution", result);

        // Test with a = 0, b = 0, c = 0
        a = 0;
        b = 0;
        c = 0;

        // Assuming your solveQuadraticEquation method returns a string
        result = Main.solveQuadraticEquation(a, b, c);

        // Check for "No solution"
        assertEquals("Infinite solutions: Every x is a solution", result);

        // White Box Testing
        // Test with a = 1, b = -3, c = 2 (roots should be 2 and 1)
        a = 1;
        b = -3;
        c = 2;

        result = Main.solveQuadraticEquation(a, b, c);

        // Check for "Two distinct real solutions: root1 = 2.0, root2 = 1.0"
        assertEquals("Two distinct real solutions: root1 = 2.0, root2 = 1.0", result);

        // Add more test cases for different scenarios
        a = 0;
        b = 2;
        c = 4;

        result = Main.solveQuadraticEquation(a, b, c);
        assertEquals("One solution (first-degree equation): x = -2.0", result);

    }
}
