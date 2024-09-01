import java.util.Scanner;

public class switch_calculator{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String separator = "---------------------------------";

        System.out.println(separator);
        System.out.println("Math Modes");
        System.out.println(separator);
        System.out.println("1. Addition\t\t(+)");
        System.out.println("2. Subtraction\t\t(-)");
        System.out.println("3. Multiplication\t(*)");
        System.out.println("4. Division\t\t(/)");
        System.out.println(separator);
        
        System.out.print("Enter a mode of calculation: ");
        String math_mode = scanner.nextLine();
        
    }
}