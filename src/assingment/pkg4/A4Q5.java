/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assingment.pkg4;

import java.util.Scanner;

/**
 *
 * @author anisoaraavram
 */
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //putting a scanner so then the user can input by keyboard
        Scanner input = new Scanner(System.in);

        //asking for the user's name
        System.out.println("Please enter in your name:");

        //the user's name will be processed and reused for the ending.
        String name = input.nextLine();

        //asking the first question
        System.out.println("What was the first test out of?");

        //allowing the user to input their answer
        double mark = input.nextDouble();

        //asking the user what he/she got out of the mark
        System.out.println("What mark did you get?");

        //allowing the user to type in their mark number
        double grade = input.nextDouble();

        //asking the second question
        System.out.println("What was the second test out of?");

        //allowing the user to input their answer
        double mark2 = input.nextDouble();

        //asking the user what he/she got out of the mark
        System.out.println("What mark did you get?");

        //allowing the user to input their answer
        double grade2 = input.nextDouble();

        //asking the third question
        System.out.println("What was the third test out of?");

        //allowing the user to input their answer
        double mark3 = input.nextDouble();

        //asking the user what he/she got out of the mark
        System.out.println("What mark did you get?");

        //allowing the user to input their mark
        double grade3 = input.nextDouble();

        //asking the fourth question
        System.out.println("What was the fourth test out of?");

        //allowing the user to input their answer
        double mark4 = input.nextDouble();

        //asking the user what he/she got out of the mark
        System.out.println("What mark did you get?");

        //allowing the user to input their answer
        double grade4 = input.nextDouble();

        //asking the fifth question
        System.out.println("What was the fifth test out of?");

        //allowing the user to input their answer
        double mark5 = input.nextDouble();

        //asking the user what he/she got out of the mark
        System.out.println("What mark did you get?");

        //allowing the user to input their answer
        double grade5 = input.nextDouble();

        //Calaculating the different grades for each test
        double score = (grade / mark) * 100;
        double score2 = (grade2 / mark2) * 100;
        double score3 = (grade3 / mark3) * 100;
        double score4 = (grade4 / mark4) * 100;
        double score5 = (grade5 / mark5) * 100;

        //telling the scores
        System.out.println("Test scores for " + name + ":");
        System.out.println("Test 1: " + score + "%");
        System.out.println("Test 2: " + score2 + "%");
        System.out.println("Test 3: " + score3 + "%");
        System.out.println("Test 4: " + score4 + "%");
        System.out.println("Test 5: " + score5 + "%");

        //calculating the average
        double average = (score + score2 + score3 + score4 + score5) / 5;

        //Telling the user their average
        System.out.println("Average " + average + "%");
    }

}
