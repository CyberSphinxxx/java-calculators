import java.util.Scanner;

public class Birthday_Calculator {
    public static void main(String[] args) {

        String separator = "-----------------------------";
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your birth month (1-12): ");
        int birthMonth = sc.nextInt();
        
        System.out.print("Enter your birth day (1-31): ");
        int birthDay = sc.nextInt();

        System.out.print("Enter your birth year: ");
        int birthYear = sc.nextInt();

        System.out.print("Enter the current month (1-12): ");
        int currentMonth = sc.nextInt();
        
        System.out.print("Enter the current day (1-31): ");
        int currentDay = sc.nextInt();

        System.out.print("Enter the current year: ");
        int currentYear = sc.nextInt();

        int age = currentYear - birthYear;
        if (currentMonth < birthMonth || (currentMonth == birthMonth && currentDay < birthDay)) {
            age = age - 1;
        }

        int daysUntilNextBirthday = 0;
        if (currentMonth == birthMonth && currentDay == birthDay) {
            daysUntilNextBirthday = 0; 
        }
        
        else if (currentMonth > birthMonth || (currentMonth == birthMonth && currentDay > birthDay)) {
            daysUntilNextBirthday = (30 - currentDay) + ((12 - currentMonth) * 30) + (birthMonth * 30) + birthDay;
        }
        
        else {
            daysUntilNextBirthday = ((birthMonth - currentMonth) * 30) + (birthDay - currentDay);
        }

        System.out.println("You are " + age + " years old.");
        System.out.println("Your next birthday is in " + daysUntilNextBirthday + " days.");
    }
}