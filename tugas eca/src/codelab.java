import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class codelab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String yourName = scanner.nextLine();

        System.out.print("Enter your gender (M/F): ");
        String genderInput = scanner.nextLine();
        String gender = (genderInput.equalsIgnoreCase("M")) ? "Male" : "Female";

        System.out.print("Enter your date of birth (YYYY-MM-DD): ");
        String dobInput = scanner.nextLine();
        LocalDate dob = LocalDate.parse(dobInput);

        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(dob, currentDate);
        int ageYears = period.getYears();
        int ageMonths = period.getMonths();

        System.out.println("\n====== Your Personal Data ======");
        System.out.println("Name: " + yourName);
        System.out.println("Gender: " + gender);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Age: " + ageYears + " years " + ageMonths + " months");

        scanner.close();
    }
}