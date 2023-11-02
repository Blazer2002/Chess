import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Creates a box of any color.
 * 
 * @author Ivan Chan 
 * @version Nov. 11th, 2020
 */
public class Box extends Actor
{
    protected GreenfootImage image;
    private int frameWidth = 5;
    
    public Box(Color color)
    {
        image = new GreenfootImage(50, 50);
        image.drawRect(0, 0, 50, 50);
        image.drawRect(frameWidth, frameWidth, 50 - frameWidth, 50 - frameWidth);
        setBoxColor(color);
        setImage(image);
    }
    
    protected void setBoxColor(Color color)
    {
        image.setColor(color);
        image.fillRect(1, 1, 50, frameWidth);
        image.fillRect(1, 1, frameWidth, 50);
        image.fillRect(1, 50 - frameWidth, 50, 50);
        image.fillRect(50 - frameWidth, 1, 50, 50);
    }
    
    /**
     * Act - do whatever the Box wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
