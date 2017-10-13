/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quizzes;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author fishc8155
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create City
        City kw = new City();
        //Create Robots
        Robot cole = new Robot(kw,1,1,Direction.EAST);
        Robot coal = new Robot(kw,2,1,Direction.EAST);
        //Create Walls for Robot Cole
        new Wall(kw,1,1,Direction.WEST);
        new Wall(kw,2,1,Direction.WEST);
        new Wall(kw,1,3,Direction.NORTH);
        new Wall(kw,1,3,Direction.SOUTH);
        new Wall(kw,1,4,Direction.NORTH);
        new Wall(kw,1,4,Direction.SOUTH);
        new Wall(kw,1,5,Direction.NORTH);
        new Wall(kw,1,5,Direction.SOUTH);
        new Wall(kw,1,6,Direction.NORTH);
        new Wall(kw,1,6,Direction.SOUTH);
        new Wall(kw,1,7,Direction.NORTH);
        new Wall(kw,1,7,Direction.SOUTH);
        new Wall(kw,1,7,Direction.EAST);
        //Create Walls for Robot Coal
        new Wall(kw,2,4,Direction.NORTH);
        new Wall(kw,2,4,Direction.SOUTH);
        new Wall(kw,2,5,Direction.NORTH);
        new Wall(kw,2,5,Direction.SOUTH);
        new Wall(kw,2,6,Direction.NORTH);
        new Wall(kw,2,6,Direction.SOUTH);
        new Wall(kw,2,7,Direction.NORTH);
        new Wall(kw,2,7,Direction.SOUTH);
        new Wall(kw,2,7,Direction.EAST);
        //Create Things for Robot Cole
        new Thing (kw,1,3);
        new Thing (kw,1,4);
        new Thing (kw,1,5);
        new Thing (kw,1,6);
        new Thing (kw,1,7);
        //Create Things for Robot coal
        new Thing (kw,2,4);
        new Thing (kw,2,5);
        new Thing (kw,2,6);
        new Thing (kw,2,7);
        //Make Robot Cole Pickthings
       cole.move();
       cole.move();
       cole.pickThing();
       cole.turnLeft();
       cole.turnLeft();
       cole.move();
       cole.move();
       cole.turnLeft();
       cole.turnLeft();
       cole.move();
       cole.move();
       cole.move();
       cole.pickThing();
       cole.turnLeft();
       cole.turnLeft();
       cole.move();
       cole.move();
       cole.move();
       cole.turnLeft();
       cole.turnLeft();
       cole.move();
       cole.move();
       cole.move();
       cole.move();
       cole.pickThing();
       cole.turnLeft();
       cole.turnLeft();
       cole.move();
       cole.move();
       cole.move();
       cole.move();
       cole.turnLeft();
       cole.turnLeft();
       cole.move();
       cole.move();
       cole.move();
       cole.move();
       cole.move();
       cole.pickThing();
       cole.turnLeft();
       cole.turnLeft();
       cole.move();
       cole.move();
       cole.move();
       cole.move();
       cole.move();
       cole.turnLeft();
       cole.turnLeft();
      cole.move();
       cole.move();
       cole.move();
       cole.move();
       cole.move();
       cole.move();
       cole.pickThing();
       cole.turnLeft();
       cole.turnLeft();
       cole.move();
       cole.move();
       cole.move();
       cole.move();
       cole.move();
       cole.move();
       cole.turnLeft();
       cole.turnLeft();
        }
        
}    
           
      

//Tried everything i possibly know, could'nt figure it out