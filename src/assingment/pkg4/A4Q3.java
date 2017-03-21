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
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Allowing the user to input into the computer by typing
        Scanner input = new Scanner(System.in);

        //Letting the user know what to do
        System.out.println("What are the four numbers that you want to type?");

        //four lines to incert the four numbers
        double name = input.nextDouble();

        double name2 = input.nextDouble();

        double name3 = input.nextDouble();

        double name4 = input.nextDouble();

        //telling the user what numbers the he/she inputed
        System.out.println("Your numbers were " + name + ", " + name2 + ", "
                + name3 + ", and " + name4 + ".");

    }

}
