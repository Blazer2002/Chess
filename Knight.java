import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the knight. Her years of training have led her to use advanced techniques to move
 * accross the battlefield.
 * 
 * @author Ivan Chan 
 * @version Dec. 26th, 2020
 */
public class Knight extends ChessPiece
{
    public Knight(int color, int[] location)
    {
        super(color, location);
        if (alignment == 0)
        {
            image = new GreenfootImage("WhiteKnight.png");
            setImage(image);
        }
        else
        {
            image = new GreenfootImage("BlackKnight.png");
            setImage(image);
        }
    }
    
    public void moves()
    {
    } 
}
