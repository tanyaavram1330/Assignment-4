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
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Inputing the scanner system into the prgrogram
        Scanner input = new Scanner(System.in);

        //Telling the user what to do
        System.out.println("Type in the inches that you want to convert into centimeters.");

        //making the user type out the inches
        double in = input.nextInt();

        //Converting the inches into cm
        double cm = 2.54 * in;

        //telling the user what the calculations are.
        System.out.println(in + "in is " + cm + " cm.");

    }

}
