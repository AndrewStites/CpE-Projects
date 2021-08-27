package Java.MasterClass;

//use "implements" for connecting interfaces
public class DeskPhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    //for an interface to be used, we need to override the methods created in the interface
    //here, we can alter them with code and differing access modifiers
    //you have to implement all the methods of an interface
    @Override
    public void powerOn() {
        System.out.println("No action taken, desk phone does not have a power button");

    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + " on deskphone");
    }

    @Override
    public void answer() {
        if (isRinging)
        {
            System.out.println("Answering the desk phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber)
        {
            isRinging = true;
            System.out.println("Ring Ring");
        }
        else
        {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
