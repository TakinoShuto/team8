import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class D here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class D extends Actor
{
    private int speed = 1;
    
    private boolean flag_d = false;
    
    private int n = 0;
    public D()
    {
        getImage().scale( 50, 50 );
    }
    /**
     * Act - do whatever the D wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int x =getX();
        int y =getY();
        
        if(y>=399){
            getWorld().removeObject(this);
        }else{
            setLocation(x,y+speed);
        }
        
        Actor actor = getOneIntersectingObject(k.class);
        if(actor != null){
            getWorld().removeObject(this);
            n = n+1;
            
        }
        if(n>=9){
            getWorld().showText("GameClear",500,200);
            Greenfoot.stop();
        }
        
        // 玉を下向きに移動
        //setLocation(getX(), getY() + speed);

        //if( Greenfoot.isKeyDown( "space" ) ){
            //if( flag_d == false ){
                //getWorld().addObject( new D(), getX(), getY() );
                //flag_d = true;
            //}
        //}  
        //else flag_d = false;

        // 画面外に出たら削除
        //if (getY() >= getWorld().getHeight()) {
           //getWorld().removeObject(this);
        //}
    }    
}
