package Java.MasterClass;

public class MobilePhone implements ITelephone{

    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    //for an interface to be used, we need to override the methods created in the interface
    //here, we can alter them with code and differing access modifiers
    //you have to implement all the methods of an interface
    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile phone powered up");
    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn)
        {
            System.out.println("Now ringing " + phoneNumber + " on mobile phone");
        }
        else
        {
            System.out.println("Phone is switched off");
        }
    }

    @Override
    public void answer() {
        if (isRinging)
        {
            System.out.println("Answering the mobile phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber && isOn)
        {
            isRinging = true;
            System.out.println("Melody Playing");
        }
        else
        {
            isRinging = false;
            System.out.println("Mobile phone is powered off or number different");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
