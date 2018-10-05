package com.company;
import com.company.MyConstants;
import java.util.Scanner;

/**
 *@Author Jack Lahey
 *
 *
 */
public class RequiredVersion {

    public static void play()
    {
        System.out.println("\nRequired Version of Week Three Challenge\n");

        int inputNumber = 0;
        String sContinue = "";
        boolean bContinue = true;
        Scanner keyboard = new Scanner(System.in);

        while (bContinue)
        {
            //ask for input and validate to ensure that it is a positive number
            do {
                System.out.println("Please enter a positive number.");
                while (!keyboard.hasNextInt()) {
                    System.out.println("That's not a number!");
                    keyboard.next(); //catch the enter key
                }
                inputNumber = keyboard.nextInt();
            } while (inputNumber <= 0);

            System.out.println("Thank you! Got " + inputNumber);

            //find out if 5 or 7 are divisors of the number
            while (inputNumber > 0) {
                if ((inputNumber % MyConstants.FIVE) == 0) {
                    System.out.println(inputNumber);
                }
                if ((inputNumber % MyConstants.SEVEN) == 0) {
                    System.out.println(inputNumber);
                }

                inputNumber--;
            }

            //This is the loop to ask if the user wants to play again
            System.out.println("Would you like to enter another number, Yes or No?");
            sContinue = keyboard.nextLine();
            while (!sContinue.equalsIgnoreCase("yes") && !sContinue.equalsIgnoreCase("no")) {
                System.out.println("Please enter either \"Yes\" or \"No\"");
                sContinue = keyboard.nextLine();
            }

            if (sContinue.equalsIgnoreCase("yes")) {
                bContinue = true;
            } else if (sContinue.equalsIgnoreCase("no"))
            {
                bContinue = false;
            }

        }//end while{bContinue)

        //end of game message
        System.out.println("\nThank you for playing!");

    }//end public static void main(String[] args)


}//end public class RequiredVersion