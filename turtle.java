import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class turtle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class turtle extends Animal
{
    /**
     * Act - do whatever the turtle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {  
     lookForLobster();
     randomTurn();
        move(1);
    }
    
    
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
    
             public void lookForLobster()
             {
    
        if(canSee(lobster.class))
        {
           eat(lobster.class);
}
}
}


       
    
