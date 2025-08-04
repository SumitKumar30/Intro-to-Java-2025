// taking console input using Scanner class
import java.util.Scanner;       // import statement
public class SecondProgram {
    public static void main(String[] args){
        System.out.println("Welcome to the Second Program!");

        // create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // prompt user for a number
        System.out.print("Please enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.println("Please enter the second number: ");
        int number2 = scanner.nextInt();

        // calculate the sum of the two numbers
        int sum = number1 + number2;
        System.out.println("The sum of "+number1+" and "+number2+" is: " + sum);

        // write a program to find whether a number is palindrome or not!
        System.out.print("Please enter a number to check if it is a palindrome: ");
        int num = scanner.nextInt();
        int originalNum = num;  
        int reversedNum = 0;

        int digit1 = num % 10; // Get the last digit
        num = num / 10; // Remove the last digit
        int digit2 = num % 10; // Get the new last digit    
        num = num / 10; // Remove the last digit
        int digit3 = num % 10; // Get the new last digit
        num = num / 10; // Remove the last digit
        int digit4 = num % 10; // Get the new last digit    
        num = num / 10; // Remove the last digit
        int digit5 = num % 10; // Get the new last digit
        num = num / 10; // Remove the last digit

        // Reconstruct the number in reverse order
        reversedNum = (digit1 * 10000) + (digit2 * 1000) + (digit3 * 100) + (digit4 * 10) + digit5;

        // Check if the original number is equal to the reversed number
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }
    }
}
