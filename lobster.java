import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lobster extends Animal
{
    /**
     * Act - do whatever the lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    { turnAtEdge();
        randomTurn();
        move(2);
        lookForCrab();}
     public void turnAtEdge()
    {
        if ( isAtEdge() ) 
        {
            turn(17);
        }
    }
     public void randomTurn()
    {
        if (Greenfoot.getRandomNumber(100) > 90) 
        {
            turn(Greenfoot.getRandomNumber(90)-45);
        }
    }
    public void lookForCrab()
    {
        if ( isTouching(crab.class) ) 
        {
            removeTouching(crab.class);
            Greenfoot.stop();
        }
    }
    
}
