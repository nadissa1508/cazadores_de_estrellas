import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nivel1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nivel1 extends World
{
    Nave1 nave1 = new Nave1(1);
    vidaNave corazon = new vidaNave();
    vidaNave corazon1 = new vidaNave();
    vidaNave corazon2 = new vidaNave();
    /**
     * Constructor for objects of class Nivel1.
     * 
     */
    public Nivel1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        prepare();
    }
    
    private void prepare(){
        
        addObject(nave1,130,275);
        Villano1 villano = new Villano1();
        addObject(villano,850,275);
        crearCorazones();
        
    }
    
    public void act(){
         Greenfoot.playSound("Musik.mp3");
    }
    
    public void crearCorazones(){
        addObject(corazon, 80, 50);
        addObject(corazon1, 160, 50);
        addObject(corazon2, 240, 50);
    }
    
    public void updateCorazones() {
        // Ocultar los corazones que ya no deben mostrarse
        int vida = nave1.getHealth();
        if(vida <= 75){
            removeObject(corazon2);
        }else if(vida <= 50){
            removeObject(corazon1);
        }
        
    }
    
    public void eliminarCorazones() {
        // Ocultar los corazones que ya no deben mostrarse
        removeObject(corazon2);
        removeObject(corazon1);
        removeObject(corazon);
        
    }
    
}

