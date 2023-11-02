import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is your King. The moment he falls, your entire Kingdom is dead. Your goal is to keep
 * your king alive at all times.
 * 
 * @author Ivan Chan 
 * @version Dec. 26th, 2020
 */
public class King extends ChessPiece
{
    public King(int color, int[] location)
    {
        super(color, location);
        if (alignment == 0)
        {
            image = new GreenfootImage("WhiteKing.png");
            setImage(image);
        }
        else
        {
            image = new GreenfootImage("BlackKing.png");
            setImage(image);
        }
    }
    
    public void moves()
    {
    }  
}
