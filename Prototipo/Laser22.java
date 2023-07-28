import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Laser22 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Laser22 extends Actor
{
    /**
     * Act - do whatever the Laser22 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        projectileMove();
        removeFromWorld();
    }
    public void projectileMove(){
        setLocation(getX()+8,getY());
    }
    public void removeFromWorld(){
        if(getX()==999){
            getWorld().removeObject(this);
        }
    }
    
}
