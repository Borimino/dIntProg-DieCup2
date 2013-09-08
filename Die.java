// import functions for random numbers
import java.util.Random;

public class Die
{
    private int eyes;
    private int sides;
    private Random r;
    
    /**
     * constructor
     */
    public Die(int sides)
    {
        this.sides = sides;
        r = new Random();
    }
    
    /**
     * obtain a new number of eyes for this die
     */
    public void roll()
    {
        eyes = r.nextInt(sides)+1;
        return;
    }
    
    /**
     * = the number of eyes of this die
     */
    public int getEyes()
    {
        return eyes;
    }
}