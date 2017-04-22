package by.epam.calculator;

public class Calculator {

    public int doAddition(int x, int y) {
        return x + y;
    }

    public int doSubtraction(int x, int y) {
        return x - y;
    }

    public int doMultiplication(int x, int y) {
        return x * y;
    }

    public float doDivision(int x, int y) {
        float convertedX = (float) x;
        return convertedX / y;
    }
}
