/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author fishc8155
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          // create new city
          City kw = new City();
          // create robot
          Robot cole = new Robot(kw,6,6,Direction.EAST);
        
          while(cole.getDirection()!= Direction.NORTH)
          
              cole.turnLeft();
          while(cole.getAvenue()!=0
                  && cole.getStreet()!=0){
              cole.move();
          }
         if(!cole.frontIsClear());{
        cole.turnLeft();
        
    }
    
      while(cole.getAvenue()!=0){
          cole.move();
      }
  
    }
}
