package com.company;
import java.util.Scanner;
/**
 *@Author Jack Lahey
 *
 * Assignment
 *
 * Part 1
 * You will write an application to print out the multiples of 5 and 7 in reverse order.
 * Your user will enter a number, and your application will print out all the required multiples from that number.
 * Once you are done, ask the user if they would like to enter another number, and continue until they choose to end the application.
 *
 * Part 2
 * Modify your application. Display all the numbers from the number you entered to 1. Substitute "Copy" for multiples of 5, and "Cat" for multiples of 7.
 * Multiples of both should read "CopyCat"
 *
 */

public class Main
{
    public static void main(String[] args) {
        String sInput = "";
        Scanner keyboard = new Scanner(System.in);

        // let user choose whether to run the required or optional portions of Week Three Challenge, or quit
        do {
            System.out.println("Please enter \"R\" Required Version,  \"O\" Optional Version,  \"H\" Hangman, or \"Q\" Quit ");

            sInput = keyboard.nextLine();

        }while (!sInput.equalsIgnoreCase("R") && !sInput.equalsIgnoreCase("O")
                && !sInput.equalsIgnoreCase("H") && !sInput.equalsIgnoreCase("Q"));

        if (sInput.equalsIgnoreCase("R")) {
            System.out.println("\nYou have selected the Required Versiaon of Week Three Challenge.");
            RequiredVersion rv = new RequiredVersion();
            rv.play();
        } else if (sInput.equalsIgnoreCase("O")) {
            System.out.println("\nYou have selected the Optional Versiaon of Week Three Challenge.");
            OptionalVersion ov = new OptionalVersion();
            ov.play();
        } else if (sInput.equalsIgnoreCase("H")) {
            System.out.println("\nYou have selected Hangman.");
            Hangman hang = new Hangman();
            hang.play();
        } else if (sInput.equalsIgnoreCase("Q")) {
            System.out.println("\nYou have selected Quit.  Goodbye.");
        }

    }//end public static void main(String[] args)


    }// end public class Main
