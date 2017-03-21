package assingment.pkg4;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author anisoaraavram
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Allowing the user to input into the computer by typing
        Scanner input = new Scanner(System.in);

        //Telling the user the instructions
        System.out.println("Throw a pair of dice to determine how "
                + "many squares your game piece will advance. ");

        System.out.println("If the piece "
                + "lands on the bottom of a ladder, the piece moves up to the "
                + "top of the ");

        System.out.println("ladder. If the piece lands on the top of a snake, "
                + "the piece \"slides\" down to the square ");

        System.out.println("at the bottom of the snake. If the piece lands on the last "
                + "square, the player ");

        System.out.println("wins. If the piece cannot advance the "
                + "number of squares indicated by the dice, ");

        System.out.println("the piece is not moved at all. If you want to quit, write '0'.");

        //creating a counter
        int counter = 1;

        //doing a while statment to connect the codes together
        while (counter < 100) {
            //telling the user what to do
            System.out.println("You are on number " + counter + ". What number did you get from the dice?");
            //allowing the user to input
            int digit = input.nextInt();

            counter = counter + digit;

            //restrict the player from cheating and to keep the numbers within 2-12
            if (digit < 0 || digit > 12 || digit == 1) {

                counter = counter - digit;
                //telling the user that they have typed in an invaled number
                System.out.println("Number invaled. Try again.");
            }

            //if the user inputs the number '0' then they quit
            if (digit == 0) {
                //telling the user if they input the number '0' they quit
                System.out.println("You Quit!");
                break;
            } //if the user gets to 100 then they win
            else if (counter == 100) {
                //outputting the message that they win
                System.out.println("You Win!");
                //stops game
                break;
            }

            //tells the user that they can't continue on over 100
            while (counter > 100) {
                //gets the counter back under 100 to continue the game
                counter = counter - digit;
                //telling the user that they rolled to high
                System.out.println("You rolled too high. Try again. You are on " + counter + ".");
                //allowing the user to still input to conintue the game
                digit = input.nextInt();

                counter = counter + digit;
            }

            //climbing the ladder 9 to 34
            if (counter == 9) {
                //getting the user's number from 9 to 34
                counter = counter + 25;
                //telling the user that they found a ladder
                System.out.println("You found a ladder!. You are now on number " + counter + ".");
                //allowing the user to still input to conintue the game
                digit = input.nextInt();

                counter = counter + digit;

            }

            //climbing the ladder 40 to 64
            if (counter == 40) {
                //getting the user's number from 40 to 60
                counter = counter + 24;
                //telling the user that they found a ladder
                System.out.println("You found a ladder! You are now on number " + counter + ".");
                //allowing the user to still input to conintue the game
                digit = input.nextInt();

                counter = counter + digit;
            }

            //climbing ladder 67 to 86
            if (counter == 67) {
                //getting the user's number from 67 to 86
                counter = counter + 19;
                //telling the user that they found a ladder
                System.out.println("You found a ladder! You are now on number " + counter + ".");
                //allowing the user to still input to conintue the game
                digit = input.nextInt();

                counter = counter + digit;
            }

            //snake, falling down from 54 t0 19
            if (counter == 54) {
                //getting the user's number from 54 to 19
                counter = counter - 35;

                System.out.println("Oh no! You fell down on a snake. "
                        + "You are now on number " + counter + ".");
                //allowing the user to still input to conintue the game
                digit = input.nextInt();

                counter = counter + digit;
            }

            //snake, falling down from 90 to 48
            if (counter == 90) {
                //getting the user's number from 90 to 48
                counter = counter - 42;
                //telling the user that they went down the snake
                System.out.println("Oh no! You fell down on a snake. "
                        + "You are now on number " + counter + ".");
                //allowing the user to still input to conintue the game
                digit = input.nextInt();

                counter = counter + digit;
            }

            //snake, falling down from  99 to 77
            if (counter == 99) {
                //getting the user;s number from 99 to 77
                counter = counter - 22;
                //telling the user that they went down the snake
                System.out.println("Oh no! You fell down on a snake. "
                        + "You are now on number " + counter + ".");
                //allowing the user to still input to conintue the game
                digit = input.nextInt();

                counter = counter + digit;
            }

        }

    }

}
