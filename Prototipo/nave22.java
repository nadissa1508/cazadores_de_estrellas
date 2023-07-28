import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class nave22 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class nave22 extends Actor
{
    boolean canFire=true;
    /**
     * Act - do whatever the nave22 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public nave22(){
        
    }
    public void act()
    {
        moveAround();
        fireProjectile();
    }
    public void moveAround(){
        if (Greenfoot.isKeyDown("W")){
            setLocation(getX()+5,getY());
        }
        if (Greenfoot.isKeyDown("S")){
            setLocation(getX()-5,getY());
        }
        if (Greenfoot.isKeyDown("D")){
            setLocation(getX(),getY()+5);
        }
        if (Greenfoot.isKeyDown("A")){
            setLocation(getX(),getY()-5);
        }
    }
    public void fireProjectile(){
        if(Greenfoot.isKeyDown("shift")&& canFire==true){
            getWorld().addObject(new Laser22(),getX()+50,getY()-2);
            canFire=false;
        }
        else if(Greenfoot.isKeyDown("shift")){
            canFire=true;
        }
    }
}
