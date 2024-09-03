import java.util.Scanner;

public class Calculator_Ternary {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            double a = sc.nextDouble();

            System.out.print("Enter an operator (+, -, *, /): ");
            char op = sc.next().charAt(0);

            System.out.print("Enter second number: ");
            double b = sc.nextDouble();
            
            double result = (op == '+') ? (a + b) : (op == '-') ? (a - b) : (op == '*') ? (a * b) : (op == '/') ? (a / b) : 0;
            System.out.println("Result: " + result);
        }
    }
}
