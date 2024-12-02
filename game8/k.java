import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class k here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class k extends Actor
{
    private int speed = 5;
    /**
     * Act - do whatever the k wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(speed); // 弾を移動させる
        // 画面外に出たら削除する
        if (isAtEdge()) {
            getWorld().removeObject(this);
        }
    }
}// Add your action code here.
        

