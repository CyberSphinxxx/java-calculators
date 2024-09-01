import java.util.Scanner;

public class switch_calculator{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String separator = "-------------------------------";

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

        double first_number = 0;
        double second_number = 0;
        double result = 0;
        
        switch (math_mode) {
            case "1":

                System.out.println("Math Mode Chosen: Addition");
                System.out.println(separator);

                System.out.print("Enter First Number: ");
                first_number =scanner.nextDouble();

                System.out.print("Enter Second Number: ");
                second_number = scanner.nextDouble();

                result = first_number + second_number;

                System.out.println(separator);

                System.out.println(first_number + " + " + second_number + " = " + result);

                System.out.println(separator);
                
                break;
 
            case "2":

                System.out.println("Math Mode Chosen: Subtraction");
                System.out.println(separator);

                System.out.print("Enter First Number: ");
                first_number =scanner.nextDouble();

                System.out.print("Enter Second Number: ");
                second_number = scanner.nextDouble();

                result = first_number - second_number;

                System.out.println(separator);

                System.out.println(first_number + " - " + second_number + " = " + result);

                System.out.println(separator);
                
                break;
            
            default:
                System.out.println("INCORRECT MATH MODE!!!");
        }
    }
}