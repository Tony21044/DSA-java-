import java.util.Scanner;

public class conditionlstmnt {
    //calc using switch stnt 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first value: ");
        int a = sc.nextInt();
        
        System.out.print("Enter second value: ");
        int b = sc.nextInt();
        
        System.out.print("Enter operator: ");
        char operator = sc.next().charAt(0);
        
        switch(operator){
            case '+':
                System.out.println("Result: " + (a + b));
                break;
            case '-':
                System.out.println("Result: " + (a - b));
                break;
            default:
                System.out.println("Invalid operator selected.");
                break;
        }
    }
}

