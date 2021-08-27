package Java.MasterClass;

public class Main {

    //interfaces are abstract; provide a common behavior to be used by other classes by implementing the same interface
    public static void main(String[] args) {
        //cannot use the interface to instantiate "newPhone"
	    ITelephone newPhone;
	    //we use the constructor to instantiate "newPhone"
	    newPhone = new DeskPhone(123456789);
	    newPhone.powerOn();
	    newPhone.callPhone(123456789);
	    newPhone.answer();

	    newPhone = new MobilePhone(987654321);
	    newPhone.powerOn();
	    newPhone.callPhone(987654321);
	    newPhone.answer();
    }
}
