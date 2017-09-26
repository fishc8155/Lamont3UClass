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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City kw = new City();
        Robot karel = new Robot(kw,3,3,Direction.EAST);
        new Wall(kw,3,3,Direction.SOUTH);
        new Wall (kw,3,3,Direction.EAST);
        new Wall (kw,2,3,Direction.EAST);
        new Wall (kw,2,3,Direction.NORTH);
        new Wall (kw,2,3,Direction.WEST);
        new Thing (kw,2,2);
        new Thing (kw,1,2);
        new Thing (kw,1,1);
        new Thing (kw,1,0);
        new Thing (kw,0,0);
        Robot maria = new Robot(kw,0,1,Direction.SOUTH);
        maria.turnLeft();
        maria.turnLeft();
        maria.turnLeft();
        maria.move();
        maria.pickThing();
        maria.turnLeft();
        maria.move();
        maria.pickThing();
        maria.turnLeft();
        maria.move();
        maria.pickThing();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.pickThing();
        karel.move();
        karel.pickThing();
        karel.turnLeft();
        
        
                
    }
}
