
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
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // scanner for input
        Scanner input = new Scanner(System.in);
        // ask for numbers
        System.out.println("please enter 4 numbers on separate lines ");
        double random = input.nextDouble();
        double random1 = input.nextDouble();
        double random2 = input.nextDouble();
        double random3 = input.nextDouble();
        
        System.out.println("your numbers were " + random+","+ random1+","+random2+","+random3);
    }
}
