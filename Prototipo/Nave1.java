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
    private int health;
    
    public Nave1()
    {
        speed_=2;
        health = 100;
    }
    
    public int getSpeed(){
        return speed_;
    }
    
    public void setSpeed(int s){
        speed_=s;
    }
    
    public int getHealth(){
        return health;
    }
    
    public void setHealth(int health){
        this.health = health;
    }
    
    public void act(){
        processKeys();
        trackMouse();
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
        Laser laser1=new Laser (5,1);
        laser1.setRotation(getRotation());
        getWorld().addObject(laser1,getX(),getY());
    }
    
    public void trackMouse(){
        MouseInfo mi = Greenfoot.getMouseInfo();
        if(mi != null){
            turnTowards(mi.getX(), mi.getY());
        }
    }
    
    public void takeDamage(int damage){
        health -= damage;
        Nivel1 nivel1 = new Nivel1();
        nivel1.updateCorazones();
        if(health <= 0){
            getWorld().removeObject(this);
            getWorld().removeObject(nivel1.corazon);
            getWorld().removeObject(nivel1.corazon1);
            getWorld().removeObject(nivel1.corazon2);
            YouLose perdiste = new YouLose();
            getWorld().addObject(perdiste);
        }
    }
    
    
}
