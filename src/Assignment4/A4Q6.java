/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import com.sun.corba.se.spi.orbutil.fsm.Input;
import java.util.Scanner;

/**
 *
 * @author fishc8155
 */
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create scanner
        Scanner input = new Scanner (System.in);
        
        System.out.println("What was the speed limit? ");
        double speedLimit = input.nextDouble();
        
        System.out.println("What speed were you driving?");
        double carSpeed = input.nextDouble();
        
        double speedFine = (carSpeed - speedLimit);
        
        if(carSpeed > 0) {
        
            if (carSpeed < speedLimit){
                System.out.println("Congratulations, you are within the speed limit");
            }
            if(speedFine >= 20){
                System.out.println("You are speeding your fine is $100");
            }
            if(speedFine >=20){
                System.out.println("You are speeding your fine is $270");   
            }
            if(speedFine >=20){
                System.out.println("You are speeding your fine is $500");
                
            }
        }
        
    }
    
    
}
