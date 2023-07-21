import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nivel1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nivel1 extends World
{

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
        Nave1 nave1=new Nave1();
        addObject(nave1,130,275);
        Villano1 villano = new Villano1();
        addObject(villano,850,275);
    }
}

