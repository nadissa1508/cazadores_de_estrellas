import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jefe3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jefe3 extends Actor
{
    private int health;
    private int timer;
    private int actCounter;
    private int puntos;
    /**
     * Act - do whatever the Jefe3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Jefe3(){
        health = 100;
        timer = 0;
        actCounter = 0;
    }
    
    public int getHealth(){
        return health;
    }
    
    public void setHealth(int health){
        this.health = health;
    }
    
    public void takeDamage(int damage){
        health -= damage;
        puntos += 5;
        getWorld().showText("Score: " + puntos,350, 50);
        YouWin win = new YouWin();
        if(health <= 0){
            getWorld().addObject(win,150 ,250);
            getWorld().removeObject(this);
        }
    }
    
    public void shootLaserVillano(){
        laserVillano laserV = new laserVillano(5,10);
        laserV.setRotation(180);
        getWorld().addObject(laserV, getX(), getY());
    }
    
    public void act()
    {
        // Add your action code here.
         move();
         actCounter++;
        
        if(actCounter % 50 == 0){
            if(timer > 0){
                timer--;
            }else{
                shootLaserVillano();
                timer = 1;
            }
        }
    }
    
    public void move(){
        move(10);
        if(Greenfoot.getRandomNumber(100) < 10){
            
            turn(Greenfoot.getRandomNumber(90) - 45);   
            
        }
        if(getX() <= 5 || getX() >= getWorld().getWidth() -5){
            
            turn(180);   
            
        }
        if(getY() <= 5 || getY() >= getWorld().getHeight() -5){
            
            turn(180);
            
        }
        
    }
    
}
