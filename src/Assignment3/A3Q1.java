/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author fishc8155
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // new city
        City kw = new City();
        // new robot
        Robot cole = new Robot(kw,0,3,Direction.WEST);
        
        // create walls
        new Wall(kw,1,1,Direction.NORTH);
        new Wall(kw,1,2,Direction.NORTH);
        new Wall(kw,1,1,Direction.WEST);
        new Wall(kw,2,1,Direction.WEST);
        new Wall(kw,2,1,Direction.SOUTH);
        new Wall(kw,2,2,Direction.SOUTH);
        new Wall(kw,1,2,Direction.EAST);
        new Wall(kw,2,2,Direction.EAST);
        
        int moveCounter = 0;
        while(moveCounter < 3){
       
        moveCounter = moveCounter + 1;
        for(int count = 0; count < 3; count = count + 1){
            cole.move();
            cole.move();
            cole.move();
            cole.turnLeft();
        }
        }
       
    }
}
