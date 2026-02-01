package main.java.com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calc = new Calculator();

    @Test
    void testAdd() {
        assertEquals(15, calc.calculate(10, 5, "add"));
    }

    @Test
    void testAddAgain() {
        assertEquals(15, calc.calculate(10, 5, "add-again"));
    }

    @Test
    void testSub() {
        assertEquals(5, calc.calculate(10, 5, "sub"));
    }

    @Test
    void testSubAgain() {
        assertEquals(5, calc.calculate(10, 5, "sub-again"));
    }

    @Test
    void testMul() {
        assertEquals(50, calc.calculate(10, 5, "mul"));
    }

    @Test
    void testDiv() {
        assertEquals(2, calc.calculate(10, 5, "div"));
    }

    @Test
    void testDivByZero() {
        assertEquals(0, calc.calculate(10, 0, "div"));
    }

    @Test
    void testMod() {
        assertEquals(1, calc.calculate(11, 5, "mod"));
    }

    @Test
    void testPow() {
        assertEquals(100000, calc.calculate(10, 5, "pow"));
    }

    @Test
    void testUnknownOp() {
        assertEquals(0, calc.calculate(10, 5, "unknown"));
    }

    @Test
    void testAddNumbers() {
        assertEquals(15, calc.addNumbers(10, 5));
    }

    @Test
    void testSumValues() {
        assertEquals(15, calc.sumValues(10, 5));
    }

    @Test
    void testAddAgainMethod() {
        assertEquals(15, calc.addAgain(10, 5));
    }
}
