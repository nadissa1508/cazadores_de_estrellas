import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nivel3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nivel3 extends World
{
    
    /**
     * Constructor for objects of class Nivel3.
     * 
     */
    public Nivel3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
         super(1000, 600, 1); 
         prepare();
    }
    
    private void prepare(){
        Nave1 nave1 = new Nave1(2);
        addObject(nave1,130,275);
        Jefe3 jefe= new Jefe3();
        addObject(jefe,850,275);
        
    }
}
