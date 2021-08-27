package Java.MasterClass;

import java.util.List;

public abstract class ListItem {
    //protected allows us to access them from our concrete subclass in this package, but not other packages
    protected ListItem rightLink = null;
    protected ListItem leftLink = null;

    protected Object value;

    public ListItem(Object value) {
        this.value = value;
    }

    //These define what must be implemented by concrete classes
    //next() returns the next item in the list
    abstract ListItem next();
    //sets the reference to the next item
    abstract ListItem setNext(ListItem item);
    //returns the previous item on the list
    abstract ListItem previous();
    //sets the reference to the previous item
    abstract ListItem setPrevious(ListItem item);

    //compares an object to the parameter
    //returns 0 if equal
    //returns a number if the item number is sorted before the object, which should be negative. Otherwise, returns a positive number
    abstract int compareTo(ListItem item);

    public Object getValue()
    {
        return value;
    }

    public void setValue(Object value)
    {
        this.value = value;
    }
}
