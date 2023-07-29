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
    //private boolean colisiono;
    
    public laserVillano(int s, int dmg){
        damage = dmg;
        speed = s;
        //colisiono = false;
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
    public boolean checkCollision(){
        Nave1 nave = (Nave1) getOneIntersectingObject(Nave1.class);
        boolean colisiono = false;
        if(nave != null){
            nave.takeDamage(damage);
            colisiono = true;
        }
        return colisiono;
    }
    
    public void act()
    {
        move(speed);
        if(isTouchingWall() || checkCollision()){
            getWorld().removeObject(this);
        }
       
        
        // Add your action code here.
    }
    
    //public void removeFromWorld(){
       // if(getX()==1){
           // getWorld().removeObject(this);
       // }
    //}
    
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

