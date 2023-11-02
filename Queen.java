import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the queen, the king's most powerful and beloved asset.
 * 
 * @author Ivan Chan 
 * @version Dec. 26th, 2020
 */
public class Queen extends ChessPiece
{
    public Queen(int color, int[] location)
    {
        super(color, location);
        if (alignment == 0)
        {
            image = new GreenfootImage("WhiteQueen.png");
            setImage(image);
        }
        else
        {
            image = new GreenfootImage("BlackQueen.png");
            setImage(image);
        }
    }
    
    public void moves()
    {
    }
}
