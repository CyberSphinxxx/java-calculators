import java.util.Scanner;

public class switch_calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String separator = "---------------------------------";
        boolean validInput = false;

        System.out.println(separator);
        System.out.println("Math Modes");
        System.out.println(separator);
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println(separator);

        String math_mode;
        double first_number;
        double second_number;
        double result = 0;

        while (!validInput) {
            System.out.print("Enter a mode of calculation: ");
            math_mode = scanner.nextLine();

            switch (math_mode) {
                case "1":
                    System.out.println("Math Mode Chosen: Addition");
                    System.out.println(separator);

                    System.out.print("Enter First Number: ");
                    first_number = scanner.nextDouble();

                    System.out.print("Enter Second Number: ");
                    second_number = scanner.nextDouble();

                    result = first_number + second_number;

                    System.out.println(separator);
                    System.out.println(first_number + " + " + second_number + " = " + result);
                    System.out.println(separator);

                    validInput = true;
                    break;

                case "2":
                    System.out.println("Math Mode Chosen: Subtraction");
                    System.out.println(separator);

                    System.out.print("Enter First Number: ");
                    first_number = scanner.nextDouble();

                    System.out.print("Enter Second Number: ");
                    second_number = scanner.nextDouble();

                    result = first_number - second_number;

                    System.out.println(separator);
                    System.out.println(first_number + " - " + second_number + " = " + result);
                    System.out.println(separator);

                    validInput = true;
                    break;

                case "3":
                    System.out.println("Math Mode Chosen: Multiplication");
                    System.out.println(separator);

                    System.out.print("Enter First Number: ");
                    first_number = scanner.nextDouble();

                    System.out.print("Enter Second Number: ");
                    second_number = scanner.nextDouble();

                    result = first_number * second_number;

                    System.out.println(separator);
                    System.out.println(first_number + " x " + second_number + " = " + result);
                    System.out.println(separator);

                    validInput = true;
                    break;

                case "4":
                    System.out.println("Math Mode Chosen: Division");
                    System.out.println(separator);

                    System.out.print("Enter First Number: ");
                    first_number = scanner.nextDouble();

                    System.out.print("Enter Second Number: ");
                    second_number = scanner.nextDouble();

                    if (second_number != 0) {
                        result = first_number / second_number;
                        System.out.println(separator);
                        System.out.println(first_number + " / " + second_number + " = " + result);
                        System.out.println(separator);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }

                    validInput = true;
                    break;

                default:
                    System.out.println("INCORRECT MATH MODE!!! Please enter a valid option (1-4).");
            }
            
            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }
        }

    }
}
