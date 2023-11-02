import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Future here.
 * 
 * @author Ivan Chan
 * @version Dec. 27th, 2020
 */
public class Future extends Box
{
    protected static ChessPiece piece;
    
    public Future()
    {
        super(Color.CYAN);
    }
    
    protected void addedToWorld(World world)
    {
        piece = Select.getSelectedChessPiece();
    }
    
    /**
     * Act - do whatever the Future wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        // if clicked on
        if(false)
        {
            int x = piece.getX();
            int y = piece.getY();
            piece.setLocation(getX(), getY());
            piece.setCoords(getX(), getY());
            World world = getWorldOfType(DisBoard.class);
            Current cur = DisBoard.getCurrent();
            Previous prev = DisBoard.getPrevious();
            if(cur != null && prev != null)
            {
                cur.setLocation(getX(), getY());
                prev.setLocation(x, y);
            }
            else
            {
                cur = new Current();
                prev = new Previous();
                DisBoard.setCurrent(cur);
                DisBoard.setPrevious(prev);
                world.addObject(cur, getX(), getY());
                world.addObject(prev, x, y);
            }
        }
    }    
}
