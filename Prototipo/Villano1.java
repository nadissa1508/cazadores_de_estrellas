import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Villano1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Villano1 extends Actor
{
    GifImage myGif = new GifImage("villano1.gif");
    private int health;
    private int timer;
    private int actCounter;
    /**
     * Act - do whatever the Villano1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Villano1(){
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
        if(health <= 0){
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
        setImage(myGif.getCurrentImage());
        actCounter++;
        
        if(actCounter % 50 == 0){
            if(timer > 0){
                timer--;
            }else{
                shootLaserVillano();
                timer = 5;
            }
        }
    }
}
