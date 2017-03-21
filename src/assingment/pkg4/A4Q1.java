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
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Inputing the Scanner to process the system
        Scanner input = new Scanner(System.in);

        //Telling the user what to do
        System.out.println("Please enter your name");

        //Allowing the user to type and for it to input into the system
        String name = input.nextLine();

        //Getting the program to respond back to the input with the 'name'
        //that the user had inputed
        System.out.println("Hello " + name + ". How are you today?");

    }

}
