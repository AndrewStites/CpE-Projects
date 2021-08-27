package Java.MasterClass;

public class Corolla extends Car {
    private int roadServiceMonths;

    public Corolla(int roadServiceMonths) {
        super("Corolla", "2WD", 5, 4, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate)
    {
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0)
        {
            stop();
            changeGear(1);
        }
        else if (newVelocity > 0 && newVelocity <= 10)
        {
            changeGear(1);
        }
        else if (newVelocity > 10 && newVelocity <= 20)
        {
            changeGear(2);
        }
        else if (newVelocity > 20 && newVelocity <= 30)
        {
            changeGear(3);
        }
        else if (newVelocity > 30 && newVelocity <= 40)
        {
            changeGear(4);
        }
        else if (newVelocity > 40 && newVelocity <= 50)
        {
            changeGear(5);
        }
        else
        {
            changeGear(6);
        }

        if (newVelocity > 0)
        {
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}
