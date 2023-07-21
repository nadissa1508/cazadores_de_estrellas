import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nave1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nave1 extends Actor
{
    /**
     * Act - do whatever the Nave1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed_;
    public Nave1()
    {
        speed_=2;
    }
    
    public int getSpeed(){
        return speed_;
    }
    
    public void setSpeed(int s){
        speed_=s;
    }
    
    public void act(){
        processKeys();
        
    }
    
    public void processKeys(){
        move(speed_);
        if (Greenfoot.isKeyDown("left")){
            turn(-5);
        }
        
        else if (Greenfoot.isKeyDown("right")){
            turn(5);
        }
        
        else if (Greenfoot.isKeyDown("up")){
            if(speed_<=10){
                speed_++;
            }
        }
        
        else if (Greenfoot.isKeyDown("down")){
            if(speed_>0){
                speed_--;
            }
        }
        if (Greenfoot.isKeyDown("space")){
            shoot();
        }
        
        
    }
    
    public void shoot(){
        Laser laser1=new Laser (5);
        laser1.setRotation(getRotation());
        getWorld().addObject(laser1,getX(),getY());
    }
}
