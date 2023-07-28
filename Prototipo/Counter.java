import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Contador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor{
    int score=0;
    public void Counter(){
        setImage(new GreenfootImage("Score: "+score,40,Color.GREEN,Color.BLACK));
    }
    public void act(){
        setImage(new GreenfootImage("Score: "+score,40,Color.GREEN,Color.BLACK));
        YouWin();
    }
    public void addScore(){
        score++;
    }
    public void YouWin(){
        if (score>=500){
            getWorld().addObject(new YouWin(),500,300);
            Greenfoot.stop();
        }
    }
}
