import java.util.Scanner;

public class receiveInfo {
    public static double[] receiveOperators() {
        Scanner sc = new Scanner(System.in);
        double[] operators = new double[2];
        System.out.print("Choose the first operator: ");
        operators[0] = sc.nextDouble();
        System.out.print("Choose the second operator: ");
        operators[1] = sc.nextDouble();
        return operators;
    }
}

