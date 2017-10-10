/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Scanner;

/**
 *
 * @author fishc8155
 */
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // scanner for input
        Scanner input = new Scanner(System.in);
        //ask for first name
        System.out.println("Please enter your name");
        //type first name
        String firstName = input.nextLine();
        // output variable to the screen
        System.out.println("Hello, how are you doing " + firstName);
        
        String howAre = input.nextLine();
        System.out.println("That is great!");
    }
}
