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
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //putting a scanner so then the user can input by keyboard
        Scanner input = new Scanner(System.in);

        //asking the user to enter in the speed limit
        System.out.println("Enter in the speed limit: ");

        //allwoing the user to tpye in the number
        int limit = input.nextInt();

        //asking the user what the driver's speed is
        System.out.println("Enter the recoreded speed of the car:");

        //asking the user to type int the speed of the driver
        int speed = input.nextInt();

        //if speed is smaller then limit
        if (limit > speed) {
            //tells the user good job
            System.out.println("Congratulations, you are within the speed limit!");
        }
        if (limit == speed) {
            //tells the user good job
            System.out.println("Congratulations, you are within the speed limit!");
        }

        //if the speed is higher then the limit
        if (limit < speed) {
            if (speed < limit + 20) {
                //telling the user the fine
                System.out.println("You are speeding and your fine is $100.");
            } else if (speed < limit + 30) {
                //telling the user the second fine 
                System.out.println("You are speeding and your fine is $270.");
            } else if (speed > limit + 30) {
                //telling the user the third fine
                System.out.println("You are speeding and your fine is $500.");
            }

        }
    }

}
