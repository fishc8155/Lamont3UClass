/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1.A1Q2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author fishc8155
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // create new city
      City cambridge = new City();
     // create new robot
      Robot cole = new Robot(cambridge,2,2,Direction.SOUTH);
      // create a wall
      new Wall(cambridge,2,2,Direction.NORTH);
      new Wall(cambridge,2,1, Direction.NORTH);
      new Wall(cambridge,2,2,Direction.SOUTH);
      new Wall(cambridge,2,2,Direction.EAST);
      new Wall(cambridge,2,1,Direction.WEST);
      new Wall(cambridge,3,1,Direction.WEST);
      new Wall(cambridge,3,1,Direction.SOUTH);
      // create a thing to interact 
      new Thing (cambridge,3,2);
      
       // move to thing
        cole.move();
        // have cole pick up the thing
        cole.pickThing();

      
      
      
    }
}
