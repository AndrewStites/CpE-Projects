package Java.MasterClass;

//public allows unrestricted access
//private allows no other class access
//protected allows classes in this package access
public class Car {

    //Called fields
    //private for only this class to access
    //public can be accessed by other classes
    private int doors;
    private int wheels;
    private String engine;
    private String color;
    private String model;

    //this is a setter
    public void setModel(String model)
    {
        String validModel = model.toLowerCase();
        //This validates whether the String in Main is either "carrera" or "commodore"
        //if so, then it will be printed to the console
        //otherwise, it will print "Unknown"
        if (validModel.equals("carrera") || validModel.equals("commodore"))
        {
            //"this" allows us to access the "model" field above
            //we then can assign it to the parameter "model" in this method
            //this allows us to keep our state of encapsulation while utilizing the field
            this.model = model;
        } else
        {
            this.model = "Unknown";
        }
    }

    //this is the getter
    public String getModel()
    {
        //this allows for the data stored in the field "model" to be used
        return this.model;
    }
}
