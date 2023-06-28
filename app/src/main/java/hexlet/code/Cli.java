package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class Cli {

    private static final Scanner scanner = new Scanner(System.in);

    private static String username;

    public static void greeting() {
        System.out.println("Welcome to the Brain Games!");

        if (username == null) {
            System.out.print("May I have your name? ");
            username = scanner.nextLine();
        }

        System.out.printf("Hello, %s!\n", username);
    }

    public static void even() {
        greeting();
        new Even().start(scanner, username);
    }

    public static void calc() {
        greeting();
        new Calc().start(scanner, username);
    }

    public static void gcd() {
        greeting();
        new GCD().start(scanner, username);
    }

    public static void progression() {
        greeting();
        new Progression().start(scanner, username);
    }

    public static void prime() {
        greeting();
        new Prime().start(scanner, username);
    }

    public static void menu() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.print("""
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                """);
        String choice;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your choice: ");
        choice = scanner.nextLine();
        System.out.println();

        switch (choice) {
            case "1" -> greeting();
            case "2" -> even();
            case "3" -> calc();
            case "4" -> gcd();
            case "5" -> progression();
            case "6" -> prime();
            case "0" -> exit();
            default -> menu();
        }
    }

    private static void exit() {
        scanner.close();
        System.exit(0);
    }
}
