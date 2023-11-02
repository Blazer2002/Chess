import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the bishop. With her sneaky magic, she can sneak accross the board to eliminate
 * enemy infiltrators.
 * 
 * @author Ivan Chan 
 * @version Dec. 26th, 2020
 */
public class Bishop extends ChessPiece
{
    public Bishop(int color, int[] location)
    {
        super(color, location);
        if (alignment == 0)
        {
            image = new GreenfootImage("WhiteBishop.png");
            setImage(image);
        }
        else
        {
            image = new GreenfootImage("BlackBishop.png");
            setImage(image);
        }
    }
    
    public void moves()
    {
    }
}
