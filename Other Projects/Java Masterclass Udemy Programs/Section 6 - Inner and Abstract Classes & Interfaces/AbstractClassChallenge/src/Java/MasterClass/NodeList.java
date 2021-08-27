package Java.MasterClass;

public interface NodeList {
    //In the case of a LinkedList, this is called the "head of the list"
    //In binary search trees, root is used a lot
    ListItem getRoot();
    //Put add and remove item in the interface for easier access across all classes
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    //This just goes through the list
    void traverse(ListItem root);
}
