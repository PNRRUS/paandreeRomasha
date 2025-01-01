package Sabito_09_2023;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    @Test
    public void add() {
        Calculator calc = new Calculator();
        int result = calc.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void sub() {
        Calculator calc = new Calculator();
        int result = calc.sub(10, 10);
        assertEquals(0, result);
    }

    @Test
    public void mul() {
        Calculator calc = new Calculator();
        int result = calc.mul(-5, -3);
        assertEquals(15, result);
    }

    @Test
    public void div() {
        Calculator calc = new Calculator();
        int result = calc.div(2, 3);
        assertEquals(0, result);
    }

    @Test
    public void pow() {
        Calculator calc = new Calculator();
        int result = calc.pow(2,3);
        assertEquals(result,8);
    }
    @Test
    public void Num3Digits() {
        Number3Digits example = new Number3Digits();
        String result = example.digitsMetode(200, 3);
        assertEquals("YES", result);

        System.out.println(example.toString());
    }
}
