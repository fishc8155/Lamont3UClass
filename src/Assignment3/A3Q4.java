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
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // new city
        City kw = new City();
        // new robot
        Robot cole = new Robot(kw,3,3,Direction.SOUTH);
        // create walls
        new Wall(kw,2,1,Direction.SOUTH);
        new Wall(kw,2,2,Direction.SOUTH);
        new Wall(kw,1,1,Direction.WEST);
        new Wall(kw,2,1,Direction.WEST);
        new Wall(kw,1,1,Direction.NORTH);
        new Wall(kw,1,2,Direction.NORTH);
        new Wall(kw,1,2,Direction.EAST);
        new Wall(kw,2,2,Direction.EAST);
        
        //create notheastern square walls
        new Wall(kw,1,4,Direction.NORTH);
        new Wall(kw,1,5,Direction.NORTH);
        new Wall(kw,1,4,Direction.WEST);
        new Wall(kw,2,4,Direction.WEST);
        new Wall(kw,2,4,Direction.SOUTH);
        new Wall(kw,2,5,Direction.SOUTH);
        new Wall(kw,1,5,Direction.EAST);
        new Wall(kw,2,5,Direction.EAST);
        
        //create southwestern square walls
        new Wall(kw,4,1,Direction.WEST);
        new Wall(kw,5,1,Direction.WEST);
        new Wall(kw,5,1,Direction.SOUTH);
        new Wall(kw,5,2,Direction.SOUTH);
        new Wall(kw,5,2,Direction.EAST);
        new Wall(kw,4,2,Direction.EAST);
        new Wall(kw,4,1,Direction.NORTH);
        new Wall(kw,4,2,Direction.NORTH);
        
        //create southeastern square walls
        new Wall(kw,4,4,Direction.WEST);
        new Wall(kw,5,4,Direction.WEST);
        new Wall(kw,5,4,Direction.SOUTH);
        new Wall(kw,5,5,Direction.SOUTH);
        new Wall(kw,5,5,Direction.EAST);
        new Wall(kw,4,5,Direction.EAST);
        new Wall(kw,4,4,Direction.NORTH);
        new Wall(kw,4,5,Direction.NORTH);
        // create counting variable
        int  moveCounter = 0;
        // continue when counter is less than 4
        while(moveCounter < 4){
        // add one to moveCounter
        moveCounter = moveCounter + 1;
        
         cole.move();
        cole.move();
        cole.move();
        cole.turnLeft();
        cole.move();
        cole.move();
        cole.move();
        cole.turnLeft();
        cole.move();
        cole.move();
        cole.move();
        cole.turnLeft();
        cole.move();
        cole.move();
        cole.move();       
        cole.move();
        cole.move();
        cole.move();
        cole.turnLeft();
        cole.move();
        cole.move();
        cole.move();
        cole.turnLeft();
        cole.move();
        cole.move();
        cole.move();
        cole.turnLeft();
        cole.move();
        cole.move();
        cole.move();
        
       
        
         for(int count = 0; count < 4; count = count + 1);
        }
        
         
 
    }
}
