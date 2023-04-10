import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int option = Main.show();
            double[] operators = receiveInfo.receiveOperators();
            double result;
            switch (option) {
                case 1:
                    result = Processing.add(operators[0], operators[1]);
                    System.out.println("The result: " + result);
                    break;
                case 2:
                    result = Processing.subtraction(operators[0], operators[1]);
                    System.out.println("The result: " + result);
                    break;
                case 3:
                    result = Processing.multiplication(operators[0], operators[1]);
                    System.out.println("The result: " + result);
                    break;
                case 4:
                    try {
                        result = Processing.division(operators[0], operators[1]);
                        System.out.println("El resultado de la división es: " + result);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Invalid Option");
                    break;
            }

        }
    }

