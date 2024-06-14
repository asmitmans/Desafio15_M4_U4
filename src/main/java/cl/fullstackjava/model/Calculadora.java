package cl.fullstackjava.model;

public class Calculadora {

    private double num1;
    private double num2;

    public Calculadora(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double sumar() {
        return num1 + num2;
    }

    public double restar() {
        return num1 - num2;
    }

    public double multiplicar() {
        return num1 * num2;
    }

    public double dividir() {
        if(num2 == 0.0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return num1 / num2;
    }

    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }
}
