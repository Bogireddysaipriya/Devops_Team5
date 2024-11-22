package com.lbrce;
import java.util.HashMap;
import java.util.Scanner;

public class Signuppage {
    private static HashMap<String, String> userDatabase = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Signup System ===");
        System.out.print("Enter a username: ");
        String username = scanner.nextLine();

        // Check if the username already exists
        if (userDatabase.containsKey(username)) {
            System.out.println("Username already exists. Please try a different one.");
        } else {
            System.out.print("Enter a password: ");
            String password = scanner.nextLine();

            // Store the username and password
            userDatabase.put(username, password);
            System.out.println("Signup successful! You can now log in.");
        }

        scanner.close(); // Close the scanner to prevent resource leak
    }
}
