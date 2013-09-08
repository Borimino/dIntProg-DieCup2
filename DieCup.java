/**
 * This class models a DieCup with instances 
 */
public class DieCup
{
    private Die d1;
    private Die d2;
    private int highest;
    
    public DieCup()
    {
        d1 = new Die(6);
        d2 = new Die(6);
    }
    
    public void roll()
    {
        d1.roll();
        d2.roll();
        if(d1.getEyes() + d2.getEyes() > highest) 
        {
            highest = d1.getEyes() + d2.getEyes();
        }
        return;
    }
    
    public int getEyes()
    {
        return d1.getEyes() + d2.getEyes();
    }
    
    public int getHighest()
    {
        return highest;
    }
    
    public void resetHighest()
    {
        highest = 0;
    }
}