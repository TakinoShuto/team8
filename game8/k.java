import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class k here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class k extends Actor
{
    /**
     * Act - do whatever the k wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if( Greenfoot.isKeyDown( "right" ) ){
        setRotation(0);
        move(1);
        }// Add your action code here.
    }    
}
