import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Select here.
 * 
 * @author Ivan Chan
 * @version Dec. 27th, 2020
 */
public class Select extends Box
{
    protected static ChessPiece piece;
    
    public Select()
    {
        super(new Color(0, 128, 128));
    }
    
    protected void addedToWorld(World world)
    {
        if(isTouching(ChessPiece.class))
        {
            piece = (ChessPiece)getOneIntersectingObject(ChessPiece.class);
            piece.moves();
        }
    }
    
    public static ChessPiece getSelectedChessPiece()
    {
        return piece;
    }
    
    /**
     * Act - do whatever the Select wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        // if clicked on
        if(false)
        {
            World world = getWorldOfType(DisBoard.class);
            List<Future> delete = world.getObjects(Future.class);
            world.removeObjects(delete);
            world.removeObject(this);
        }
    }    
}
