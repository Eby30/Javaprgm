package registration;

import java.util.Scanner; // Import Scanner class for user input

// Main class
public class WelcomeForm {

    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Ask user for first name
        System.out.print("Enter your first name: ");
        String firstName = sc.nextLine(); 

        // Ask user for age
        System.out.print("Enter your age: ");
        int age = sc.nextInt();  // Store age

        // Display welcome message using user input
        System.out.println("\n--- Registration Successful ---");
        System.out.println("Welcome, " + firstName + "!");
        System.out.println("You are " + age + " years old.");

        // Close scanner 
        sc.close();
    }
}