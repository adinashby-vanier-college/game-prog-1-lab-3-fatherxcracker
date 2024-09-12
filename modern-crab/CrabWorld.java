// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class CrabWorld here.
 * @author (your name) @version (a version number or a date)
 */
public class CrabWorld extends World
{

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * Constructor for objects of class CrabWorld.
     */
    public CrabWorld()
    {
        super(560, 560, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab =  new  Crab();
        addObject(crab, 220, 226);
        Worm worm =  new  Worm();
        addObject(worm, 377, 402);
        Worm worm2 =  new  Worm();
        addObject(worm2, 145, 101);
        Worm worm3 =  new  Worm();
        addObject(worm3, 422, 105);
        Worm worm4 =  new  Worm();
        addObject(worm4, 131, 444);
        Worm worm5 =  new  Worm();
        addObject(worm5, 451, 278);
        Worm worm6 =  new  Worm();
        addObject(worm6, 277, 511);
        Worm worm7 =  new  Worm();
        addObject(worm7, 62, 353);
        Worm worm8 =  new  Worm();
        addObject(worm8, 289, 65);
        Worm worm9 =  new  Worm();
        addObject(worm9, 39, 36);
        Worm worm10 =  new  Worm();
        addObject(worm10, 493, 477);
        Worm worm11 =  new  Worm();
        addObject(worm11, 246, 342);
        Lobster lobster =  new  Lobster();
        addObject(lobster, 369, 175);
        lobster.setLocation(363, 162);
        lobster.setLocation(363, 162);
        removeObject(lobster);
        Lobster lobster2 =  new  Lobster();
        addObject(lobster2, 380, 209);
        lobster2.setLocation(374, 221);
        lobster2.setLocation(488, 393);
    }
}
