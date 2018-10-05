package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/**
 *@Author Jack Lahey
 *
 * You are going to write a word guessing game app in Java. This game is a simpler version of Hangman.
 *

 * Requirements:
 *
 * Initialize your array list with the following words:
 * Tree
 * Rain
 * Bear
 * Encourage
 * Promise
 * Soup
 * Chess
 * Insurance
 * Pancakes
 * Stream
 * When you run the application, randomly choose a word from that list for the user to guess.
 * For each letter the user guesses wrong, let them know along with how many wrong guesses they have left.
 * The user is allowed up to 5 wrong guesses. On the 6th wrong guess, they lose the game.
 * If the user guesses correctly, output the word with the letters they have guessed correctly so far and blanks for letters they have not guessed yet.
 * The user can input either a letter or a word for their guess.
 * If the user guesses the word correctly, output "You've won!" and end the game.
 *
 * Hints:
 *
 * Comparing Strings: Remember that Java is case-sensitive
 * If you do not know what value a variable is, you can always print it out!
 * Add all words to the array list in lowercase.
 * You will need one array to hold the letters of the word to guess and a separate array to hold the letters the user has guessed so far.
 * If an array has been declared with no initial values, each element of the array has a value of null.
 * You can stop a do-while or while loop from continuing by using the break keyword.
 * Watch your opening and closing curly braces! { }
 */
public class Hangman {

    public void play()
    {
        // create instance of Random class
        Random random = new Random();
        //ArrayList to store words
        ArrayList<String> wordList = new ArrayList<String>();
        Scanner keyboard = new Scanner(System.in);
        String sInput = "";
        String sWordSelection = "";
        String sWordGuess = "";
        int iWordSelection = 0;
        int iWordSize = 0;
        char cHangGuess;
        char [] cHangGuessArray = {};
        int iIncorrectGuessCount =0;
        boolean bWinner = false;

        wordList.add("Tree");
        wordList.add("Rain");
        wordList.add("Bear");
        wordList.add("Encourage");
        wordList.add("Promise");
        wordList.add("Soup");
        wordList.add("Chess");
        wordList.add("Insurance");
        wordList.add("Pancakes");
        wordList.add("Stream");

        System.out.println("\nLets play Hangman!\n");

        // Generate random integers in range 0 to size of the ArrayList for word selection
        iWordSelection = random.nextInt(wordList.size());

        //get the random word
        sWordSelection = wordList.get(iWordSelection);

        iWordSize = sWordSelection.length();
        cHangGuessArray = new char [iWordSize];

        //display values for testing
//        System.out.println("The word is " + sWordSelection );
//        System.out.println("The number of characters is " + iWordSize);
//        for(int i = 0 ; i < iWordSize ; i++)
//        {
//            System.out.println(sWordSelection.charAt(i));
//        }
//        for(int i = 0 ; i < 50 ; i++ )
//        {
//            System.out.println(random.nextInt(wordList.size()));
//        }
//        iWordSelection = random.nextInt(wordlist.size());
//
//
//        iMaximum = wordlist.size();
//
//        iWordSelection = random.nextInt(iMaximum - iMinimum + 1) + iMinimum;
//
//        System.out.println(wordList.get(0));
//
//        for (String s : wordList) {
//               System.out.println(s);
//        }


        for (int i = 0 ; i < iWordSize ; i ++)
        {
            cHangGuessArray[i] = '_';
        }

        System.out.print("Here is the word I am thinking of: ");
        for(int i = 0 ; i < iWordSize ; i++)
        {
            System.out.print(cHangGuessArray[i] + " ");
        }
        System.out.print("\n\n");

        do {
           System.out.print("Enter your guess: ");
            cHangGuess = keyboard.next().charAt(0);
            keyboard.nextLine();

            //test to see if the guessed letter is in the word
            for (int j = 0; j < iWordSize; j++)
            {
                if( cHangGuess == sWordSelection.charAt(j))
                {
                    //if the character is in the selected word, set the character in the array to match
                    cHangGuessArray[j] = cHangGuess;
                }
                else {
                    iIncorrectGuessCount++;
                    System.out.println("You have guessed incorrectly " + iIncorrectGuessCount + "/6 times.");
                    System.out.print("Your guess so far ");
                    for (int k = 0; k < iWordSize; k++) {
                        System.out.print(cHangGuessArray[j] + " ");
                    }
                    System.out.print("\n");
                }//end if( cHangGuess = sWordSelection.charAt(j)

            }//end for (int j = 0; j < iWordSize; j++)

            //test to see if user has completed the word.
            //if user has completed the word set bWinner to true
            //this code is not yet written.  I ran out of time.


        }while((iIncorrectGuessCount < 6)&&( bWinner == false));


        System.out.println("\nThank you for playing!");



    }

}
