/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author fishc8155
 */
public class A2Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create city
        City kw = new City();
        // create robot
        Robot cole = new Robot(kw,1,0,Direction.NORTH);
        //create walls of castle
        new Wall(kw,1,1,Direction.NORTH);
        new Wall(kw,1,1,Direction.EAST);
        new Wall(kw,1,1,Direction.SOUTH);
        new Wall(kw,1,1,Direction.WEST);
        new Wall(kw,4,1,Direction.NORTH);
        new Wall(kw,4,1,Direction.EAST);
        new Wall(kw,4,1,Direction.SOUTH);
        new Wall(kw,4,1,Direction.WEST);
        new Wall(kw,1,4,Direction.NORTH);
        new Wall(kw,1,4,Direction.EAST);
        new Wall(kw,1,4,Direction.SOUTH);
        new Wall(kw,1,4,Direction.WEST);
        new Wall(kw,4,4,Direction.NORTH);
        new Wall(kw,4,4,Direction.EAST);
        new Wall(kw,4,4,Direction.SOUTH);
        new Wall(kw,4,4,Direction.WEST);
        new Wall(kw,2,2,Direction.NORTH);
        new Wall(kw,2,3,Direction.NORTH);
        new Wall(kw,2,2,Direction.WEST);
        new Wall(kw,3,2,Direction.WEST);
        new Wall(kw,3,2,Direction.SOUTH);
        new Wall(kw,3,3,Direction.SOUTH);
        new Wall(kw,2,3,Direction.EAST);
        new Wall(kw,3,3,Direction.EAST);
        
        
        cole.move();
        cole.turnLeft();
        cole.turnLeft();
        cole.turnLeft();
        cole.move();
        cole.move();
        cole.turnLeft();
        cole.turnLeft();
        cole.turnLeft();
        cole.move();
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
        cole.turnLeft();
        cole.turnLeft();
        cole.move();
        cole.move();
        cole.turnLeft();
        cole.turnLeft();
        cole.turnLeft();
        cole.move();
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
        cole.turnLeft();
        cole.turnLeft();
        cole.move();
        cole.move();
        cole.turnLeft();
        cole.turnLeft();
        cole.turnLeft();
        cole.move();
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
        cole.turnLeft();
        cole.turnLeft();
        cole.move();
        cole.move();
        cole.turnLeft();
        cole.turnLeft();
        cole.turnLeft();
        cole.move();
        cole.turnLeft();
        cole.move();
        cole.turnLeft();
        cole.move();
        cole.turnLeft();
        cole.turnLeft();
        cole.turnLeft();
        cole.move();
        
    }
}
