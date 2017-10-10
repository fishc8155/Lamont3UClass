/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 *
 * @author fishc8155
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // new city
        City kw = new City();
        // new robot
        Robot cole = new Robot(kw,1,2,Direction.EAST);
        //make things
        new Thing(kw,1,2);
        new Thing(kw,1,2);
        new Thing(kw,1,2);
        new Thing(kw,1,2);
        new Thing(kw,1,2);
        new Thing(kw,1,2);
        new Thing(kw,1,2);
        new Thing(kw,1,2);
        new Thing(kw,1,2);
        new Thing(kw,1,2);
        
        int moveThings = 0;
        while(moveThings < 10){
        
        moveThings = moveThings + 1;
        for(int count = 0; count < 10; count = count + 1){
        cole.pickThing();
        cole.move();
        cole.putThing();
        cole.turnLeft();
        cole.turnLeft();
        cole.move();
        cole.turnLeft();
        cole.turnLeft();
        
       
    
        }
        }
        
       
    
    }
}
