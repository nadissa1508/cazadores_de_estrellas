import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Jefe2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jefe2 extends Actor
{
    int timesHit=99999999;
    /**
     * Act - do whatever the Jefe2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        hitByProjectile();
    }
    public void hitByProjectile(){
        Actor laser=getOneIntersectingObject(Laser22.class);
        if(laser !=null){
            getWorld().removeObject(laser);
            World world = getWorld();
            Nivel2 myWorld = (Nivel2)world;
            Counter counter = myWorld.getCounter();
            counter.addScore();
            timesHit--;
        }
        if (timesHit==0){
            World world = getWorld();
            Nivel2 myWorld = (Nivel2)world;
            HealthBar healthbar=myWorld.getHealthBar();
            healthbar.loseHealth();
            healthbar.loseHealth();
            getWorld().removeObject(this);
        }
    }
}
