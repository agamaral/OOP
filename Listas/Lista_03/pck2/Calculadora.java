package pck2;

public class Calculadora {
    private double res;

    public double soma(double a, double b) {
        res = a + b;
        return res;
    }
    
    public double sub(double a, double b) {
        res = a - b;
        return res;
    }

    public double div(double a, double b) {
        res = a / b;
        return res;
    }

    public double mul(double a, double b) {
        res = a * b;
        return res;
    }

}