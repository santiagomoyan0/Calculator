import java.util.Scanner;

public class Main {
        public static int show() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Calculator");
            System.out.println("1. Add");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.print("Choose an option: ");
            int option = sc.nextInt();
            return option;
        }
    }
