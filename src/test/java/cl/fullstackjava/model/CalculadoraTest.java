package cl.fullstackjava.model;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculadoraTest {

    private static Calculadora calc;

    @BeforeAll
    public static void init() {
        calc =  new Calculadora(14,7);
    }

    @Test
    public void sumar() {
        double result = calc.getNum1() + calc.getNum2();
        assertEquals(result,calc.sumar());
    }

    @Test
    public void restar() {
        double result = calc.getNum1() - calc.getNum2();
        assertEquals(result,calc.restar());
    }

    @Test
    public void multiplicar() {
        double result = calc.getNum1() * calc.getNum2();
        assertEquals(result,calc.multiplicar());
    }

    @Test
    public void dividir() {
        double result = calc.getNum1() / calc.getNum2();
        assertEquals(result,calc.dividir());
    }

    @Test
    public void testDividirPorCero() {
        Calculadora calculadora = new Calculadora(14,0);
        assertThrows(ArithmeticException.class, calculadora::dividir);
    }

}
