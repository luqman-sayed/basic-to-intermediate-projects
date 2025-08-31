import java.util.*;

public class calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Calculator.");
        System.out.println("Please Choose the operation you want to perform:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int c = sc.nextInt();

        switch(c) {
            case 1:     //Addition
                System.out.println("Enter two numbers:");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("The sum is: " + (a + b));
                break;

            case 2:     //Subtraction
                System.out.println("Enter two numbers:");
                int x = sc.nextInt();
                int y = sc.nextInt();
                System.out.println("The difference is: " + (x - y));
                break;

            case 3:     //Multiplication
                System.out.println("Enter two numbers:");
                int p = sc.nextInt();
                int q = sc.nextInt();
                System.out.println("The product is: " + (p * q));
                break;

            case 4:     //Division
                System.out.println("Enter two numbers:");
                int s = sc.nextInt();
                int t = sc.nextInt();
                if (t != 0) 
                    System.out.println("The quotient is: " + (s / t));
                
                else 
                    System.out.println("Error: Division by zero is not allowed.");
                
                break;

            default:    //Invalid choice
                System.out.println("Invalid choice! Please select a valid operation!");
        }//switch ends
    }//main ends
}//class ends
