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
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Allowing the user to input into the computer by typing
        Scanner input = new Scanner(System.in);

        //asking the user what the costs are
        System.out.println("Answers the questions to see total cost.");

        //asking the first question
        System.out.println("How much does the food for prom cost?");

        //letting the user type the cost of food
        int name = input.nextInt();

        //asking the second question
        System.out.println("How much does the DJ cost?");

        //letting the user type the cost of the DJ
        int name2 = input.nextInt();

        //asking the third question
        System.out.println("How much does it cost to rent the hall?");

        //letting the user type the cost of the hall
        int name3 = input.nextInt();

        //asking the fourth question
        System.out.println("How much does the decorations cost?");

        //letting the user type the cost of the decorations
        int name4 = input.nextInt();

        //asking the fifth question
        System.out.println("How much does it cost for staff?");

        //letting the user type the cost of the staff
        int name5 = input.nextInt();

        //asking the sixth question
        System.out.println("How much for micellaneous costs?");

        //letting the user type the cost of the micellaneous
        int name6 = input.nextInt();

        //calculating the total cost
        int cost = name + name2 + name3 + name4 + name5 + name6;

        //the number of tickets to break even
        //Math.ceil(The the equation) wil always round up.
        int ticket = (int) Math.ceil(cost / 35.0);

        //Telling the user how much it costs and how to break even with tickets
        System.out.println("The total cost is $" + cost + ". You will need to sell "
                + ticket + " tickets to break even.");

    }

}
