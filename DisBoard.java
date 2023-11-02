import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Welcome to DisBoard. This is a chess game where the players send back and forth this
 * greenfoot file and snap a screenshot to ensure that the other player does not cheat.
 * 
 * Have fun!
 * 
 * @author Ivan Chan 
 * @version Dec. 27th, 2020
 */
public class DisBoard extends World
{
    protected GreenfootImage board;
    protected static Previous prev;
    protected static Current cur;
    protected ChessPiece[] pieces;
    /**
     * The Creation of a new World. Calling this will reset the world to its former glory.
     * 
     */
    public DisBoard()
    {    
        // Create a new world with 8x8 cells with a cell size of 50x50 pixels.
        super(8, 8, 50);
        board = new GreenfootImage("board.jpg");
        board.setTransparency(128);
        setBackground(board);
        prev = null;
        cur = null;
        // if file exists, ... else:
        pieces = new ChessPiece[32];
        initializeNewPieces();
        placePieces();
    }
    
    public void initializeNewPieces()
    {
        // initialize pieces  w        b       w      b
        int[][][] coord = {{{0, 0}, {0, 7}, {7, 0}, {7, 7}}, 
                          {{1, 0}, {1, 7}, {6, 0}, {6, 7}},
                          {{2, 0}, {2, 7}, {5, 0}, {5, 7}} };
        for(int i=0; i<4; i++)
        {
            pieces[i] = new Rook(i%2, coord[0][i]);
        }
        for(int i = 4; i<8; i++)
        {
            pieces[i] = new Knight(i%2, coord[1][i-4]);
        }
        for(int i=8; i<12; i++)
        {
            pieces[i] = new Bishop(i%2, coord[2][i-8]);
        }
        for(int i = 12; i<20; i++)
        {
            pieces[i] = new Pawn(0, new int[] {i-12, 1});
        }
        for(int i = 20; i<28; i++)
        {
            pieces[i] = new Pawn(1, new int[] {i-20, 6});
        }
        pieces[28] = new King(0, new int[] {4, 0});
        pieces[29] = new Queen(0, new int[] {3, 0});
        pieces[30] = new King(1, new int[] {4, 7});
        pieces[31] = new Queen(1, new int[] {3, 7});
    }
    
    public void placePieces()
    {
        for(ChessPiece i: pieces)
        {
            addObject(i, i.getCoords()[0], i.getCoords()[1]);
        }
    }
    
    public static Current getCurrent()
    {
        return cur;
    }
    
    public static Previous getPrevious()
    {
        return prev;
    }
    
    public static void setCurrent(Current other)
    {
        cur = other;
    }
    
    public static void setPrevious(Previous other)
    {
        prev = other;
    }
    
    public void act()
    {
        //if press enter, save state of board onto file.
        //mouseinfo
    }
}
