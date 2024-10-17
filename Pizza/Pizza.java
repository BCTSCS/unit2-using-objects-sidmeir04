import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pizza here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pizza extends Actor
{
    /**
     * Act - do whatever the Pizza wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public String toppings;
    public int size;
    public Pizza(int psize, String type){
        getImage().scale(10*psize, 10*psize);
        getImage().setColor(Color.BLUE);
        getImage().drawString(type, 0, 0);
    }
    
    @Override  
    protected void addedToWorld(World world){
        Cheese cheese_topping = new Cheese();
        world.addObject( this, getX(), getY());
    
    }
}
