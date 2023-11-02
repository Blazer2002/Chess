import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is your rook, a powerful pillar that blocks your opponent from getting to your king.
 * 
 * @author Ivan Chan 
 * @version Dec. 26th, 2020
 */
public class Rook extends ChessPiece
{
    public Rook(int color, int[] location)
    {
        super(color, location);
        if (alignment == 0)
        {
            image = new GreenfootImage("WhiteRook.png");
            setImage(image);
        }
        else
        {
            image = new GreenfootImage("BlackRook.png");
            setImage(image);
        }
    }
    
    public void moves()
    {
    } 
}
