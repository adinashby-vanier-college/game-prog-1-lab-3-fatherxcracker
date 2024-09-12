// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Lobster extends Actor
{

    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
        eat();
        turn();
        zombify();
    }

    /**
     * 
     */
    public void moveAround()
    {
        move(4);
        if (Greenfoot.getRandomNumber(10) == 1) {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if (isAtEdge()) {
            turn(180);
        }
    }

    /**
     * 
     */
    public void turn()
    {
        if (Greenfoot.getRandomNumber(10) == 1) {
            turn(Greenfoot.getRandomNumber(360));
        }
    }

    /**
     * 
     */
    public void eat()
    {
        Actor crab = getOneIntersectingObject(Crab.class);
        if (crab != null) {
            World world = getWorld();
            world.removeObject(crab);
            Greenfoot.playSound("horror-hit-logo-142395.mp3");
        }
    }

    /**
     * 
     */
    public void zombify()
    {
        Actor worm = (Worm)getOneIntersectingObject(Worm.class);
        if (worm != null) {
            int wormX = worm.getX();
            int wormY = worm.getY();
            World world = getWorld();
            world.removeObject(worm);
            Lobster newLobster =  new  Lobster();
            world.addObject(newLobster, wormX, wormY);
        }
    }
}
