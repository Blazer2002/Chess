import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Creates a red box showing where the current chosen piece can move.
 * 
 * @author Ivan Chan 
 * @version Dec. 27th, 2020
 */
public class Current extends Box
{
    public Current()
    {
        super(Color.RED);
    }
    
    /**
     * Act - do whatever the Current wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    
    public String toString()
    {
        return getClass().getName() + ", " + getX() + ", " + getY();
    }
}
