import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their name
        System.out.print("Please enter your name: ");
        String userName = scanner.nextLine(); // Read the entire line

        // Prompt the user for their favorite number
        System.out.print("Please enter your favorite number: ");
        int favoriteNumber = scanner.nextInt(); // Read an integer

        // Display the collected information
        System.out.println("Hello, " + userName + "!");
        System.out.println("Your favorite number is: " + favoriteNumber);

        // Close the scanner to release resources
        scanner.close();
    }
}