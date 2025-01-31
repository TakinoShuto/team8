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
    
    private int flag_k = 0;
    
    
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
            if( flag_k == 0 ){
                getWorld().addObject( new k (), getX(), getY() );
                flag_k = flag_k+1;
            }
        }  
        else flag_k = 0;
        getWorld().showText(""+flag_k,200,200);
        // 画面外に出たら削除
        if (getY() <= 0) {
            getWorld().removeObject(this);
        }
    }
}

        

