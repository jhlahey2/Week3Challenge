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
        char chHangGuess;
        char [] cHangGuessArray = {};
        int iIncorrectGuessCount =0;
        boolean bWinner = false;

        //add words to list
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

        //select random word
        sWordSelection = wordList.get(iWordSelection);

        //allocate an array to hold the guesses
        iWordSize = sWordSelection.length();
        cHangGuessArray = new char [iWordSize];

        //display values for testing
        System.out.println("The word is " + sWordSelection );
        System.out.println("The number of characters is " + iWordSize);

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
            //get input from user and change it to lower case
            System.out.println("\nEnter your guess: ");
            chHangGuess = Character.toLowerCase(keyboard.next().charAt(0));
            keyboard.nextLine();

            boolean bGoodGuess = false;

            //test to see if the guessed letter is in the word
            for (int j = 0; j < iWordSize; j++)
            {
                //if the character is in the selected word,
                if( chHangGuess == Character.toLowerCase(sWordSelection.charAt(j) ))
                {
                    //set character in the array to match
                    cHangGuessArray[j] = chHangGuess;
                    //set boolean to true
                    bGoodGuess = true;

                }//end if( chHangGuess = sWordSelection.charAt(j)

            }//end for (int j = 0; j < iWordSize; j++)

            //display guesses so far to user
            System.out.print("Your guess so far: ");
            for(int i = 0 ; i < iWordSize ; i++)
            {
                System.out.print(cHangGuessArray[i] + " ");
            }
            System.out.print("\n");

            //if it is a good guess, test to see if the user has completed the word
            if(bGoodGuess) {

                System.out.println("Good Guess!");
                String testString = new String(cHangGuessArray);

                //test to see if the word is complete
                if(testString.equalsIgnoreCase(sWordSelection))
                {
                    bWinner = true;
                    System.out.println("You Are a WINNER!  Hurrah!");
                }
            }
            else {

                iIncorrectGuessCount++;
                System.out.println("You have guessed incorrectly " + iIncorrectGuessCount + "/6 times.");

                if(!(iIncorrectGuessCount < 6)){
                    System.out.println("Sorry, you lose!");
                }
            }//end if(bGoodGuess)


        }while((iIncorrectGuessCount < 6) && (bWinner == false));

        System.out.println("\nThank you for playing!");

    }//end public void play()

}//end public class Hangman
