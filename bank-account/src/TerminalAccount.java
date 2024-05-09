import java.util.Locale;
import java.util.Scanner;

public class TerminalAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Type your account number:");
        int accountNumber = scanner.nextInt();
        
        System.out.println("Type your agency number:");
        String agencyNumber = scanner.next();
        
        System.out.println("Type your Name:");
        String clientName = scanner.next();
        
        System.out.println("Type your Balance:");
        double clientBalance = scanner.nextDouble();

        System.out.println("Hi, Mr(s) " + clientName + ". Thank you to create an account ");
        System.out.println("Your account number is: " + accountNumber);
        System.out.println("Your agency number is: " + agencyNumber);
        System.out.println("Your Balance is: $" + clientBalance + " already avaliable");
    }
}