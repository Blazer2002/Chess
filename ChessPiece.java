import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Chesspieces represent your army.
 * 
 * @author Ivan Chan 
 * @version Dec. 27th, 2020
 */
public abstract class ChessPiece extends Actor
{
    int alignment; // 0 = white, 1 = black
    int[] coord;
    GreenfootImage image;
    public ChessPiece(int color, int[] location)
    {
        alignment = color;
        if(location.length <= 2)
        {
            coord = location;
        }
        else
            throw new InputMismatchException("Coordinates should only have 2 numbers.");
    }
    
    public ChessPiece(int color, int x, int y)
    {
        alignment = color;
        coord = new int[] {x, y};
    }
    
    public abstract void moves();
    
    /**
     * Act - do whatever the ChessPiece wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        // if clicked on
        if(false)
        {
            Select select = new Select();
            World world = getWorldOfType(DisBoard.class);
            world.addObject(select, getX(), getY());
        }
    }
    
    public int[] getCoords()
    {
        return coord;
    }
    
    public void setCoords(int[] location)
    {
        if(location.length <= 2)
        {
            coord = location;
        }
        else
            throw new InputMismatchException("Coordinates should only have 2 numbers.");
    }
    
    public void setCoords(int x, int y)
    {
        coord = new int[] {x, y};
    }
    
    public int getAlignment()
    {
        return alignment;
    }
    
    public String toString()
    {
        return getClass().getName() + ", " + alignment + ", " + getX() + ", " + getY();
    }
}
