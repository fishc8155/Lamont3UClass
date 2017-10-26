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
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create scanner
        Scanner input = new Scanner (System.in);
        int currentplace = 0;
        while (true){
            // make dice
            System.out.println("ENTER THE SUM OF THE DICE");
            int diceNumber = input.nextInt();
            
            if(diceNumber == 0){
                System.out.println("DO NOT CHEAT!");
           
            }
            
            if(diceNumber == 1){
                System.out.println("DO NOT CHEAT!");
            }
            if(diceNumber == 2){
                currentplace = currentplace + 2;
                System.out.println("You are currently at "+ currentplace);
                System.out.println("roll again");
            }
            if(diceNumber == 3){
                currentplace = currentplace + 3;
                System.out.println("You are currently at "+ currentplace);
                System.out.println("roll again");
                        
            }
            if (diceNumber == 4){
                currentplace = currentplace + 4;
                System.out.println("You are currently at "+ currentplace);
                System.out.println("Roll again");
            }
            if (diceNumber == 5){
                currentplace = currentplace + 5;
                System.out.println("You are currently at "+ currentplace);
                System.out.println("Roll again");
            }
            if(diceNumber == 6){
                currentplace = currentplace + 6;
                System.out.println("You are currently at " + currentplace);
                System.out.println("Roll again");
            }
            // make ladders 
            if(currentplace == 9){
                currentplace = currentplace + 25;
                System.out.println("You are currently at "+ currentplace);
                System.out.println("Roll again");
            }
            if(currentplace == 40){
                currentplace = currentplace + 24;
                System.out.println("You are currently at "+ currentplace);
                System.out.println("Roll again");
            }
            if(currentplace == 67){
                currentplace = currentplace + 19;
                System.out.println("You are currently at "+ currentplace);
                System.out.println("Roll again");
            }
            //make snakes
            if(currentplace == 54){
                currentplace = currentplace - 35;
                System.out.println("You are currently at "+ currentplace);
                System.out.println("Roll again");
            }
            if(currentplace == 90){
                currentplace = currentplace - 42;
                System.out.println("You are currently at "+ currentplace);
                System.out.println("Roll again");
            }
            if(currentplace == 99){
                currentplace = currentplace - 22;
                System.out.println("You are currently at "+ currentplace);
                System.out.println("Roll again");
            }
            if(currentplace == 100){
                System.out.println("You win!");
            }
            
        }
        
        
    }
}
