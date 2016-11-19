import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class crab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class crab extends Animal
{
    /**
     * Act - do whatever the crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        lookForWorm();
        move(3);
        if(Greenfoot.isKeyDown("left")){
            turn(-10);
    }    
    if(Greenfoot.isKeyDown("right")){
            turn(10);
        }
    }    
    public void lookForWorm()
    {
        if(canSee(worm.class))
        {
           eat(worm.class);
}
}
}

