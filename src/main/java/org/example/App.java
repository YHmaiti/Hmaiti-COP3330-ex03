/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Yohan Hmaiti
 */

// This program prompts for a quote and an author.
// The program displays the quotation and author as described
// in the assignment prompt.

package org.example;

import java.util.*;

public class App {

    public static void main(String[] args) {

        // Initialize a scanner called scanner
        Scanner scanner = new Scanner(System.in);

        // Create string variables that will store the quote
        // and its author
        String quote;
        String author;

        // Prompt the user for the quote and its author accordingly
        System.out.print("What is the quote? ");
        quote = scanner.nextLine();
        System.out.print("Who said it? ");
        author = scanner.nextLine();

        // Output to the screen as required through the assignment
        // Use escape characters
        System.out.print(author.concat(" says, ").concat("\"").concat(quote).concat("\""));

    }

}
