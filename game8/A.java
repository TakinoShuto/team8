import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class A here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class A extends Actor
{
    public A()
    {
        getImage().scale( 100, 100 );
    }
    
    /**
     * Act - do whatever the A wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {  
        int x = getX();
        int y = getY();

        if( Greenfoot.isKeyDown( "left" ) ){
        setLocation(x-5,y);
        
        }

        if( Greenfoot.isKeyDown( "right" ) ){
        setLocation(x+5,y);
        }   

        if( Greenfoot.isKeyDown( "space" ) ){
            getWorld().addObject( new k(), getX(), getY() );
        }
}
   
}
