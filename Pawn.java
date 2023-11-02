import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the pawn. She may be weak, but she packs potential.
 * 
 * @author Ivan Chan 
 * @version Dec. 26th, 2020
 */
public class Pawn extends ChessPiece
{
    public Pawn(int color, int[] location)
    {
        super(color, location);
        if (alignment == 0)
        {
            image = new GreenfootImage("WhitePawn.png");
            setImage(image);
        }
        else
        {
            image = new GreenfootImage("BlackPawn.png");
            setImage(image);
        }
    }
    
    public void moves()
    {
    } 
}
