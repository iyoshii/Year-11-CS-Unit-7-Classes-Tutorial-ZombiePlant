public class ZombiePlant
{
    //properties
    private final int maxPotency;
    private int treatmentsNeeded;

    //constructor

    public ZombiePlant(int maxPotency, int treatmentsNeeded)
    {
        this.maxPotency = maxPotency;
        this.treatmentsNeeded = treatmentsNeeded;
    }

    //behaviours

    public int getPotencyRequired(){
        return maxPotency;
    }

    public int treatmentsNeeded()
    {
        return treatmentsNeeded;
    }

    public boolean isDangerous()
    {
        return treatmentsNeeded > 0;
    }

    public void treat(int potency) {
        if (potency > maxPotency) {
            treatmentsNeeded++;
        } else if (potency > 0 && treatmentsNeeded > 0) {
            treatmentsNeeded--;
        }
    }
}