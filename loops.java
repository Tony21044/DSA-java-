import java.util.*;

public class loops {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number;
        int oddSum = 0;
        int evenSum = 0;
        int choice;

        do {
            System.out.println("Enter your number");
            number = sc.nextInt();
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
            System.out.println("Do you want to continue? Press 1 for yes and 0 for no.");
            choice = sc.nextInt();
        } while (choice == 1);
        
        System.out.println("Sum of odd numbers: " + oddSum);
        System.out.println("Sum of even numbers: " + evenSum);
    }
}

