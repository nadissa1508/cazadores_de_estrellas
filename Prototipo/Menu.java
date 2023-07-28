import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
    Flecha flecha=new Flecha();
    private int opcion=0; // 0=jugar| 1=Salir
    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        super(1000, 600, 1);

        prepararMundo();
    }
    
    private void prepararMundo(){
        addObject(new Jugar(),525,400);
        addObject(new Exit(),475,500);
        addObject(new NombreDelJuego(),525,200);
        addObject(flecha,350,400);
    }
    
    public void act(){
        if (Greenfoot.isKeyDown("UP") && opcion!=0) {opcion++;}
        if (Greenfoot.isKeyDown("Down") && opcion!=1) {opcion--;}
        if (opcion>=2) opcion=0;
        if (opcion<0) opcion=1;
        
        flecha.setLocation(300,400+(opcion*100));
        
        if (Greenfoot.isKeyDown("SPACE") || Greenfoot.isKeyDown("ENTER")){
            switch(opcion){
                case 0: //Jugar
                    Greenfoot.setWorld(new Nivel2());
                    break;
                case 1: //Salir
                    Greenfoot.stop();
                    break;
            }
        }
    }
}
