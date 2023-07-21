import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nave2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nave2 extends Actor
{
    /**
     * Act - do whatever the Nave2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed_;
    public Nave2()
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
        if (Greenfoot.isKeyDown("a")){
            turn(-5);
        }
        
        else if (Greenfoot.isKeyDown("d")){
            turn(5);
        }
        
        else if (Greenfoot.isKeyDown("w")){
            if(speed_<=10){
                speed_++;
            }
        }
        
        else if (Greenfoot.isKeyDown("s")){
            if(speed_>0){
                speed_--;
            }
        }
        move(speed_);
    }
}
