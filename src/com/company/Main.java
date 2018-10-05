package com.company;
import java.util.Scanner;
/**
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

//    public static final int FIVE = 5;
//    public static final int SEVEN = 7;

    public static void main(String[] args)
    {
//        RequiredVersion rv = new RequiredVersion();
//        rv.play();
        RequiredVersion rv = new RequiredVersion();
        rv.play();
//        OptionalVersion ov = new OptionalVersion();
//        ov.play();
    }

//    //This is the main method
//    public static void main(String[] args)
//    {
//        int inputNumber = 0;
//        String sContinue = "";
//        boolean bContinue = true;
//        Scanner keyboard = new Scanner(System.in);
//
//        while(bContinue)
//        {
//            System.out.println("Enter a number");
//            inputNumber = keyboard.nextInt();
//            keyboard.nextLine();
//
//            //find out if 5 or 7 are divisors of the number
//            while(inputNumber > 0)
//            {
//                if((inputNumber % FIVE) == 0)
//                {
//                    System.out.println(inputNumber);
//                }
//                if((inputNumber % SEVEN) == 0)
//                {
//                    System.out.println(inputNumber);
//                }
//
//                inputNumber--;
//            }
//
//            //This is the loop to ask if the user wants to play again
//            System.out.println("Would you like to enter another number, Yes or No?");
//            sContinue = keyboard.nextLine();
//            if( sContinue.equalsIgnoreCase("yes"))
//            {
//                bContinue = true;
//            }
//            else if( sContinue.equalsIgnoreCase("no"))
//            {
//                bContinue = false;
//            }
//            else
//                while( !sContinue.equalsIgnoreCase("yes") && !sContinue.equalsIgnoreCase("no"))
//                {
//                    System.out.println("Please enter either \"Yes\" or \"No\"");
//                    sContinue = keyboard.nextLine();
//                    bContinue = true;
//                }
//
//        }//end while{bContinue)
//
//        //end of game message
//        System.out.println("\nThank you for playing!");
//
//    }//end public static void main(String[] args)

}// end public class Main
