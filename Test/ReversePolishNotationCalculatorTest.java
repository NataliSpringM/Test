import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class ReversePolishNotationCalculatorTest {

    private static ReversePolishNotationCalculator calculator;
    @BeforeAll
    public static void createInstance() {
        calculator = new ReversePolishNotationCalculator();
    }

    @Test
    public static void shouldCalculateAddition() {
        Assertions.assertEquals(7, calculator.calculatePolishNotation("4 3 +"));
    }
    @Test
    public static void shouldCalculateAdditionNegative() {
        Assertions.assertEquals(-1, calculator.calculatePolishNotation("-4 3 +"));
    }
    @Test
    public static void shouldCalculateSubtraction() {
        Assertions.assertEquals(1, calculator.calculatePolishNotation("4 3 -"));
    }
    @Test
    public static void shouldCalculateSubtractionNegative() {
        Assertions.assertEquals(7, calculator.calculatePolishNotation("4 -3 -"));
    }
    @Test
    public static void shouldCalculateMultiplication() {
        Assertions.assertEquals(12, calculator.calculatePolishNotation("4 3 *"));
    }

    @Test
    public static void shouldCalculateMultiplicationNegative() {
        Assertions.assertEquals(12, calculator.calculatePolishNotation("-4 -3 *"));
    }

    @Test
    public static void shouldIgnoreExtraSpaces() {
        Assertions.assertEquals(7, calculator.calculatePolishNotation("4     3    +"));
    }


    @Test
    public static void shouldCalculateMixOperations() {
        Assertions.assertEquals(2, calculator.calculatePolishNotation( "4 5 3 -1 * + -"));
    }

    @Test
    public static void shouldEvaluateSingleNumber() {
        Assertions.assertEquals(12, calculator.calculatePolishNotation("12"));
    }

    @Test
    public static void shouldThrowExceptionWhenEmptyInput() {
        final NoSuchElementException exception = assertThrows(
                NoSuchElementException.class,
                () -> calculator.calculatePolishNotation(""));
    }

    @Test
    public static void shouldThrowExceptionWhenInvalidInput() {
        final NumberFormatException exception = assertThrows(
                NumberFormatException.class,
                () ->calculator.calculatePolishNotation("2 3 %"));
        assertEquals("For input string: \"%\"", exception.getMessage());
    }

}
