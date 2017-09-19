/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1.A1Q2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author fishc8155
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City kw = new City();
                
        Robot cole = new Robot(kw,0,0,Direction.SOUTH);
        Robot bob = new Robot (kw,0,1,Direction.SOUTH);
        new Wall (kw,0,1,Direction.WEST);
        new Wall (kw,1,1,Direction.WEST);
        new Wall(kw,1,1,Direction.SOUTH);
        
        cole.move();
        bob.move();
        bob.turnLeft();
        cole.move();
        bob.move();
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        bob.move();
        cole.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        cole.move(); bob.move();
        
        
    }
}
