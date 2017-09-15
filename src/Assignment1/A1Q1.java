/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;
import java.awt.Color;

/**
 *
 * @author fishc8155
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a new city called toronto
        City toronto = new City();
        // create a robot
        Robot cole = new Robot(toronto,3,5,Direction.NORTH);
        // change cole's colour green
        cole.setColor(Color.GREEN);
        // crete a wall to interact with
        new Wall(toronto,3,2,Direction.NORTH);
        
        new Wall(toronto,3,3,Direction.NORTH);
        // create a wall to interact with
        new Wall (toronto,3,4,Direction.NORTH);
        // create new wall to interact with
        new Wall (toronto,3,2,Direction.WEST);
        // create new wall to interact with
        new Wall (toronto,4,2,Direction.WEST);
        // create new wall to interact with
        new Wall (toronto,4,2,Direction.SOUTH);
        //create a new wall to interact with
        new Wall (toronto,4,3,Direction.SOUTH);
        //create a new wall to interact with
        new Wall (toronto,4,4,Direction.SOUTH);
        // create a new wall to interact with
        new Wall (toronto,3,4,Direction.EAST);
        // create a new wall to interact with
        new Wall (toronto,4,4,Direction.EAST);
        // get cole to move
        cole.move();
        cole.turnLeft();
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
                cole.move();
                cole.turnLeft();
                 cole.move();
                  cole.move();
        
        
        
        
        
    }
}
