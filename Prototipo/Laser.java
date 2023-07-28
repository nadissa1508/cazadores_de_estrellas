import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Laser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Laser extends Actor
{
    private int speed;
    private int damage;
    private boolean colisiono;
    
    public Laser(int s, int dmg){
        damage=dmg;
        speed=s;
        colisiono = false;
    }
    
    public int getDamage(){
        return damage;
    }
    
    public int getSpeed(){
        return speed;
    }
    
    public void setSpeed(int s){
        speed= s;
    }
    
    /**
     * Act - do whatever the Laser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(speed);
        //checkBoundaries();
        if(!colisiono){
            checkCollision();
        }else{
            if(isTouchingWall()){
                getWorld().removeObject(this);
            }
        }
        
    }
    
/*+
 * public void checkBoundaries(){
        GreenfootImage img=getImage();
        int width=img.getWidth();
        int height=img.getHeight();
        
        World livesIn=getWorld();
        
        int left=getX()-width/2;
        int right= getX()+width/2;
        int top=getY()-height/2;
        int bottom=getY()+height/2;
        
        if (left <= 0 || right >= livesIn.getWidth() || top <= 0 || bottom >= livesIn.getHeight()) {
            livesIn.removeObject(this);
        }
        
        if (left<=0){
            livesIn.removeObject(this);
        }else if (right>=livesIn.getWidth()){
            livesIn.removeObject(this);
        }
        else if(top<=0){
            livesIn.removeObject(this);
        }
        else if(botom>=livesIn.getHeight()){
            livesIn.removeObject(this);
        }
        
    }
 * 
 */
   
    public void checkCollision(){
        Villano1 villano = (Villano1) getOneIntersectingObject(Villano1.class);
        if(villano != null){
            villano.takeDamage(damage);
            colisiono = true;
            getWorld().removeObject(this);
        }
    }
    
    private boolean isTouchingWall() {
        // Obtener la posición del objeto
        int x = getX();
        int y = getY();
        
        // Obtener las dimensiones del mundo (escenario)
        int worldWidth = getWorld().getWidth();
        int worldHeight = getWorld().getHeight();
        
        // Verificar si el objeto está tocando las paredes (izquierda, derecha, arriba o abajo)
        if (x <= 0 || x >= worldWidth - 1 || y <= 0 || y >= worldHeight - 1) {
            return true;
        }
        
        return false;
    }
}
