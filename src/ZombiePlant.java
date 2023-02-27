public class ZombiePlant {

    private int potency;
    private int treatment;

    public ZombiePlant(int p, int t)
    {
        potency = p;
        treatment = t;
    }

    public int treatmentsNeeded()
    {
        return treatment;
    }

    public int getPotencyRequired()
    {
        return potency;
    }

    public boolean isDangerous()
    {
        if(treatment == 0)
            return false;
        else
            return true;
    }

    public void treat(int t)
    {
        if(t > 0 && !(treatment == 0))
        {
            if (t <= potency)
                treatment--;
            else
                treatment++;
        }
        else if(t > 0 && t > potency && treatment == 0)
            treatment++;
    }
}
