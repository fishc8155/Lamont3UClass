/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author fishc8155
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // new city
       City kw = new City();
       // new robot
      Robot cole = new Robot(kw, 3, 0, Direction.EAST);
       // new wall
       new Wall(kw,3,2,Direction.WEST);
       new Wall (kw,3,2,Direction.NORTH);
       new Wall (kw,2,3,Direction.WEST);
       new Wall (kw,1,3,Direction.WEST);
       new Wall (kw,1,3,Direction.NORTH);
       new Wall (kw,1,3,Direction.EAST);
       new Wall (kw,2,4,Direction.NORTH);
       new Wall (kw,2,4,Direction.EAST);
       new Wall (kw,3,4,Direction.EAST);
       // new thing
       new Thing(kw,3,1);
       // make cole move
       cole.move();
       cole.pickThing();
       cole.turnLeft();
       cole.move();
       cole.turnLeft();
       cole.turnLeft();
       cole.turnLeft();
       cole.move();
       cole.turnLeft();
       cole.move();
       cole.move();
       cole.turnLeft();
       cole.turnLeft();
       cole.turnLeft();
       cole.move();
       cole.putThing();
       cole.move();
       cole.turnLeft();
       cole.turnLeft();
       cole.turnLeft();
       cole.move();
       cole.turnLeft();
       cole.move();
       cole.turnLeft();
       cole.turnLeft();
       cole.turnLeft();
       cole.move();
       cole.move();
       cole.turnLeft();
       
       
      
       
       
    } 
}
