import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nave11 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nave11 extends Actor
{
    boolean canFire=true;
    /**
     * Act - do whatever the Nave11 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAround();
        fireProjectile();
    }
    public void moveAround(){
        if (Greenfoot.isKeyDown("up")){
            setLocation(getX()+5,getY());
        }
        if (Greenfoot.isKeyDown("down")){
            setLocation(getX()-5,getY());
        }
        if (Greenfoot.isKeyDown("right")){
            setLocation(getX(),getY()+5);
        }
        if (Greenfoot.isKeyDown("left")){
            setLocation(getX(),getY()-5);
        }
    }
    public void fireProjectile(){
        if(Greenfoot.isKeyDown("space")&& canFire==true){
            getWorld().addObject(new Laser22(),getX()+50,getY()-2);
            canFire=false;
        }
        else if(Greenfoot.isKeyDown("space")){
            canFire=true;
        }
    }
}
