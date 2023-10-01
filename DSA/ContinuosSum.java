package DSA;
import java.util.Scanner;


public class ContinuosSum {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter numbers (type 'x' to calculate the sum):");

        while (true) {
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("x")) {
                break;
            }

            try {
                int number = Integer.parseInt(input);
                sum += number;
            }
             catch (NumberFormatException x) 
            {
                System.out.println("Invalid input. Please enter a valid number or 'x' to exit.");
            }
        }

        System.out.println("Sum of all entered numbers: " + sum);
        scanner.close();
    }
}

    
    

