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
    private int speed_;
    /**
     * Act - do whatever the nave22 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public nave22(){
        speed_=2;
    }
    public void act()
    {
        moveAround();
        fireProjectile();
    }
    public int getSpeed(){
        return speed_;
    }
    public void setSpeed(int s){
        speed_=s;
    }
    public void moveAround(){
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
    }
    public void fireProjectile(){
        if(Greenfoot.isKeyDown("shift")&& canFire==true){
            Laser22 projectile = new Laser22();
            getWorld().addObject(projectile,getX()+5,getY()-2);
            projectile.setRotation(getRotation());
            canFire=false;
        }
        else if(Greenfoot.isKeyDown("shift")){
            canFire=true;
        }
    }
}
