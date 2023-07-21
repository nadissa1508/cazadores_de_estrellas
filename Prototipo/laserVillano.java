import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class laserVillano here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class laserVillano extends Actor
{
    private int speed;
    private int damage;
    private boolean colisiono;
    
    public laserVillano(int s, int dmg){
        damage = dmg;
        speed = s;
        colisiono = false;
    }
    
    public int getDamage() {
        return damage;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int s) {
        speed = s;
    }
    /**
     * Act - do whatever the laserVillano wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void checkCollision(){
        Nave1 nave = (Nave1) getOneIntersectingObject(Nave1.class);
        if(nave != null){
            nave.takeDamage(damage);
            colisiono = true;
            getWorld().removeObject(this);
        }
    }
    
    public void act()
    {
        if(colisiono){
            return;
        }
        move(speed);
        checkCollision();
        // Add your action code here.
    }
}
