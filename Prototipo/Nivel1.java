import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nivel1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nivel1 extends World
{
    Nave1 nave1 = new Nave1();
    private int numCorazones;
    private int maxCorazones;
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
        maxCorazones = 3;
        numCorazones = maxCorazones;
        
        for (int i = 0; i < maxCorazones; i++) {
            vidaNave corazon = new vidaNave();
            addObject(corazon, 50 + i * 80, 50);
        }
    }
    
    public void act(){
        int vidaNave = nave1.getHealth();
        int corazonesMostrados = Math.min(maxCorazones, (vidaNave + 25) / 50); 
        if (corazonesMostrados != numCorazones) {
            updateCorazones(corazonesMostrados);
        }
    }
    
    private void updateCorazones(int corazonesMostrados) {
        // Ocultar los corazones que ya no deben mostrarse
        for (int i = maxCorazones - 1; i >= corazonesMostrados; i--) {
            vidaNave corazon = (vidaNave) getObjects(vidaNave.class).get(i);
        }
        
        // Mostrar los corazones que deben mostrarse
        for (int i = 0; i < corazonesMostrados; i++) {
            vidaNave corazon = (vidaNave) getObjects(vidaNave.class).get(i);
        }
        
        numCorazones = corazonesMostrados;
    }
}

