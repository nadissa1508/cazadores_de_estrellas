import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Meteorito here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Meteorito extends Enemigos
{
    /**
     * Act - do whatever the Meteorito wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Meteorito(){
        
    }
    public void act()
    {
        moveEnemy();
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
            getWorld().removeObject(this);
        }
        else if (getY()==599){
            World world = getWorld();
            Nivel2 myWorld = (Nivel2)world;
            HealthBar healthbar=myWorld.getHealthBar();
            healthbar.loseHealth();
            getWorld().removeObject(this);
        }
    }
}
