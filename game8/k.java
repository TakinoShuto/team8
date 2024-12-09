import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class k here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class k extends Actor
{
    private int speed = 3;
    
    private boolean flag_k = false;
    
    /**
     * Act - do whatever the k wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public k()
    {
        getImage().scale( 30, 30 );
    }
    public void act() {
        // 玉を上向きに移動
        setLocation(getX(), getY() - speed);
        
        if( Greenfoot.isKeyDown( "space" ) ){
            if( flag_k == false ){
                getWorld().addObject( new k(), getX(), getY() );
                flag_k = true;
            }
        }  
        else flag_k = false;
        
        // 画面外に出たら削除
        if (getY() <= 0) {
            getWorld().removeObject(this);
        }
    }
}

        

