import java.util.Scanner;

class BirthMonthChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their birth month
        System.out.print("Enter your birth month (1 - 12): ");
        int birthMonth = scanner.nextInt();

        // Check if the entered value is within the range
        if (birthMonth >= 1 && birthMonth <= 12) {
            // If within range, echo the input
            System.out.println("Your birth month is: " + birthMonth);
        } else {
            // If not within range, output an error message
            System.out.println("You entered an incorrect month value: " + birthMonth);
        }

        scanner.close();
    }
}
