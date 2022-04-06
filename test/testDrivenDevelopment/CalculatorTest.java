package testDrivenDevelopment;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;
    @BeforeEach
    void calculatorObject(){
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Adding two numbers")
    void additionOfTwoNumbers(){
        assertEquals(4, calculator.add(2,2));
    }

    @Test
    @DisplayName("Multiplying two numbers")
    void multiplicationOfTwoNumbers(){
        assertEquals(6, calculator.multiply(2,3));
    }

    @Test
    @DisplayName("Dividing two numbers")
    void quotientOfTwoNumbers(){
        assertEquals(9, calculator.divide(18, 2));
    }

    @Test
    @DisplayName("Dividing a number by zero")
    void divisionOfNumberByZero(){
        assertEquals(0, calculator.divide(15, 0));
    }

    @Test
    @DisplayName("Subtracting two numbers")
    void differenceOfTwoNumbers(){
        assertEquals(4, calculator.subtract(34,30));
    }

    @Test
    @DisplayName("Absolute subtraction of numbers")
    void absoluteSubtractionOfTwoNumbers(){
        assertEquals(4, calculator.subtract(30, 34));
    }
}