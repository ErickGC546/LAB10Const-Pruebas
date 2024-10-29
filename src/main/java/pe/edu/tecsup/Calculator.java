package pe.edu.tecsup;



public class Calculator {

    public int sub(int a, int b) {
        return a - b;
    }
    public int add(int a, int b) {
        return a + b;
    }
    public int multiplicacion(int a, int b) {
        return a * b;
    }
    public double division(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division entre 0");
        }
        return (double) a / b;
    }
}
