import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nivel2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nivel2 extends World
{
    /**
     * Constructor for objects of class Nivel2.
     * 
     */
    public Nivel2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        prepare();
    }
    public void act(){
            addEnemy();
    }
    public void addEnemy(){
        if(Greenfoot.getRandomNumber(100)<2){
            addObject(new Meteorito(),Greenfoot.getRandomNumber(1000),0);
        }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        nave22 nave22 = new nave22();
        addObject(nave22,128,321);
        Jefe2 jefe2 = new Jefe2();
        addObject(jefe2,893,313);
    }
}
