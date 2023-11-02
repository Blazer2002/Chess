import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Creates a blue box showing where the previous chosen piece had moved from.
 * 
 * @author Ivan Chan 
 * @version Dec. 27th, 2020
 */
public class Previous extends Box
{
    public Previous()
    {
        super(Color.ORANGE);
    }
    
    /**
     * Act - do whatever the Previous wants to do. This method is called whenever
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
