import java.util.Scanner;

public class Function_Calculator {

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error! Division by zero is not allowed!.");
            return 0;
        }
        return num1 / num2;
    }

    public static void separator() {
        System.out.println("-----------------------------------");
    }

    public static void main(String[] args) {

        separator();
        System.out.println("Math Modes");
        separator();
        System.out.println("(+)\tAddition");
        System.out.println("(-)\tSubtraction");
        System.out.println("(*)\tMultiplication");
        System.out.println("(/)\tDivision");
        separator();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        separator();

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        separator();

        double result = 0;
        
        switch (operator) {
            case '+':
                result = add(num1, num2);
                break;

            case '-':
                result = subtract(num1, num2);
                break;
            
            case '*':
                result = multiply(num1, num2);
                break;
            
            case '/':
                result = divide(num1, num2);
                break;

            default:
                System.out.println("Invalid operator!");
                return;
        }        
        System.out.println(num1 + " + " + num2 + " = " + result);
        System.out.println("The result is: " + result);
        separator();
    }
}
