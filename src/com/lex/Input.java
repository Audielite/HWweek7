package com.lex;

import java.util.Scanner;

/**
 * Created by alexishennings on 3/20/17.
 */
public class Input {

    private static Scanner scanner = new Scanner(System.in);   //Global scanner used for all input

    public static int getPositiveIntInput(String question) {

        if (question != null) {
            System.out.println(question);
        }
        while (true) {
            try {
                String stringInput = scanner.nextLine();
                int intInput = Integer.parseInt(stringInput);
                if (intInput >= 0) {
                    return intInput;
                } else {
                    System.out.println("Please enter a positive number");
                }
            } catch (NumberFormatException fne) {
                System.out.println("Please type a positive number");
            }
        }
    }

    public static String getStringInput(String question) {
        if (question != null) {
            System.out.println(question);
        }
        String entry = scanner.nextLine();
        return entry;
    }
}