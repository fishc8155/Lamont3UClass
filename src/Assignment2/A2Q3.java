/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author fishc8155
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City kw = new City();
        Robot cole = new Robot(kw,1,0,Direction.EAST);
        
        new Wall(kw,1,0,Direction.SOUTH);
        new Wall(kw,1,0,Direction.EAST);
        new Wall(kw,1,1,Direction.SOUTH);
        new Wall(kw,1,1,Direction.EAST);
        new Wall(kw,1,2,Direction.SOUTH);
        new Wall(kw,1,3,Direction.SOUTH);
        new Wall(kw,1,3,Direction.EAST);
        new Wall(kw,1,4,Direction.SOUTH);
        new Wall(kw,1,5,Direction.SOUTH);
        new Wall(kw,1,6,Direction.SOUTH);
        new Wall(kw,1,6,Direction.EAST);
        new Wall(kw,1,7,Direction.SOUTH);
        new Wall(kw,1,8,Direction.SOUTH);
        new Thing(kw,1,8);
        cole.turnLeft();
        cole.move();
        cole.turnLeft();
        cole.turnLeft();
        cole.turnLeft();
        cole.move();
        cole.turnLeft();
        cole.turnLeft();
        cole.turnLeft();
        cole.move();
        cole.turnLeft();
        cole.turnLeft();
        cole.move();
        cole.turnLeft();
        cole.turnLeft();
        cole.turnLeft();
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
        cole.turnLeft();
        cole.turnLeft();
        cole.turnLeft();
        cole.move();
        cole.turnLeft();
        cole.move();
        cole.move();
        cole.turnLeft();
        cole.move();
        cole.turnLeft();
        cole.turnLeft();
        cole.turnLeft();
        cole.move();
        cole.turnLeft();
        cole.turnLeft();
        cole.turnLeft();
        cole.move();
        cole.turnLeft();
        cole.move();
        cole.pickThing();
        
        
        
        
        
       
    
        
    }
}
