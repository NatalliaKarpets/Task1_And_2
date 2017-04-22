package by.epam.calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Enter first param (integer)");
                int firstParam = Integer.parseInt(in.next());
                System.out.println("Enter second param (integer)");
                int secondParam = Integer.parseInt(in.next());
                System.out.println("Enter operation (+, -, /, *)");
                calculate(firstParam, secondParam, in.next());

                System.out.println("Do you want to try again (y/n)?");
                if ("n".equals(in.next())) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Error. Please try again");
            }
        }
    }

    private static void calculate(int firstParam, int secondParam, String operation) {
        Calculator calculator = new Calculator();
        switch (operation) {
            case "+": {
                System.out.println("result: " + calculator.doAddition(firstParam, secondParam));
                break;
            }
            case "-": {
                System.out.println("result: " + calculator.doSubtraction(firstParam, secondParam));
                break;
            }
            case "*": {
                System.out.println("result: " + calculator.doMultiplication(firstParam, secondParam));
                break;
            }
            case "/": {
                System.out.println("result: " + calculator.doDivision(firstParam, secondParam));
                break;
            }
            default:
                System.out.println("No such operation");
        }
    }
}
