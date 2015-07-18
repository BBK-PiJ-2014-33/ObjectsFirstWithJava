
/**
 * Write a description of class Screen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Screen
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;

    /**
     * Constructor for objects of class Screen
     */
    public Screen(int xRes, int yRes)
    {
        // initialise instance variables
        x = xRes;
        y = yRes;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int numberOfPixels()
    {
        // put your code here
        return x * y;
    }
    
    private void clear(boolean invert)
    {
        
    }
    
}
