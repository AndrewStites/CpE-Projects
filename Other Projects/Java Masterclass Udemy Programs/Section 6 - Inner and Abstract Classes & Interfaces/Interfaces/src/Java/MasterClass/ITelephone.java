package Java.MasterClass;

public interface ITelephone {
    //creating the signature
    //no actual code here but when implemented in a class
    //the access modifiers are redundant here due to setting them in the respective class
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
