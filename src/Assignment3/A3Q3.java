/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author fishc8155
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create city
        City kw = new City();
        // create robot
        Robot cole = new Robot(kw,1,1,Direction.EAST,20);
        
        int dropThing = 0;
        while(dropThing < 2){
        
        dropThing = dropThing + 1;
        for(int count = 0; count < 2; count = count + 1){
            
        cole.putThing();
        cole.move();
        cole.putThing();
        cole.move();
        cole.putThing();
        cole.move();
        cole.putThing();
        cole.move();
        cole.putThing();
        cole.turnLeft();
        cole.turnLeft();
        cole.turnLeft();
        cole.move();
        cole.turnLeft();
        cole.turnLeft();
        cole.turnLeft();
        cole.putThing();
        cole.move();
        cole.putThing();
        cole.move();
        cole.putThing();
        cole.move();
        cole.putThing();
        cole.move();
        cole.putThing();
        cole.turnLeft()    ;
        cole.move();
        cole.turnLeft();
        }
        }
        
       
    }
}
