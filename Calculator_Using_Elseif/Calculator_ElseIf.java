import java.util.Scanner;

public class Calculator_ElseIf {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String separator = "---------------------------------";

        System.out.println(separator);
        System.out.println("Math Modes");
        System.out.println(separator);
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println(separator);
        
        System.out.print("Enter a mode of calculation: ");
        String math_mode = scanner.nextLine();

        double first_number;
        double second_number;
        double result = 0;

        if (math_mode.equals("1")) {
            System.out.println("Math Mode Chosen: Addition");
            System.out.print("Enter First Number: ");
            first_number = scanner.nextDouble();

            System.out.print("Enter Second Number: ");
            second_number = scanner.nextDouble();

            result = first_number + second_number;
            System.out.println("Result: " + first_number + " + " + second_number + " = " + result);
        }
        
        else if (math_mode.equals("2")) {
            System.out.println("Math Mode Chosen: Subtraction");
            System.out.print("Enter First Number: ");
            first_number = scanner.nextDouble();

            System.out.print("Enter Second Number: ");
            second_number = scanner.nextDouble();

            result = first_number - second_number;
            System.out.println("Result: " + first_number + " - " + second_number + " = " + result);
        }
        
        else if (math_mode.equals("3")) {
            System.out.println("Math Mode Chosen: Multiplication");
            System.out.print("Enter First Number: ");
            first_number = scanner.nextDouble();

            System.out.print("Enter Second Number: ");
            second_number = scanner.nextDouble();

            result = first_number * second_number;
            System.out.println("Result: " + first_number + " * " + second_number + " = " + result);
        }
        
        else if (math_mode.equals("4")) {
            System.out.println("Math Mode Chosen: Division");
            System.out.print("Enter First Number: ");
            first_number = scanner.nextDouble();

            System.out.print("Enter Second Number: ");
            second_number = scanner.nextDouble();

            if (second_number != 0) {
                result = first_number / second_number;
                System.out.println("Result: " + first_number + " / " + second_number + " = " + result);
            }
            
            else {
                System.out.println("Error: Division by zero is not allowed.");
            }
        }
        
        else {
            System.out.println("INCORRECT MATH MODE!!! Please enter a valid option (1-4).");
        }

        scanner.close();
    }
}
