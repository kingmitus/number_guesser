import java.util.Scanner;
import java.util.Random;

public class number_guess {

    public static void main(String[] args){
        Random rand = new Random();
        int target_int = rand.nextInt(101);
        System.out.println("The number is between 0 and 100");
        Scanner scan = new Scanner(System.in);
        System.out.println("Guess a number: ");
        int num = scan.nextInt();
        System.out.print("your guess is :" + num);
        while (num != target_int) {
            System.out.print("Guess a number: ");
            num = scan.nextInt();

            if (num < 0 || num > 99) {
                System.out.println("Please guess a number within the range of 0 to 99.");
            } else if (num < target_int) {
                System.out.println("Too low! Try again.");
            } else if (num > target_int) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("You got it! The number was " + target_int + ".");
            }
        }

        scan.close(); // Close the scanner to prevent resource leaks
    }
}

