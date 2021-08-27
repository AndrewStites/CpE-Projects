package Java.MasterClass;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    //Instead of String, we use the class Contact
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    // When adding or updating be sure to check if the contact already exists (use name)
    public boolean addNewContact(Contact contact)
    {
        if(findContact(contact.getName()) >= 0)
        {
            System.out.println("Contact is already on file");
            return false;
        }

        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact)
    {
        int foundPosition = findContact(oldContact);

        if (foundPosition < 0)
        {
            System.out.println(oldContact.getName() + ", was not found.");
            return false;
        }
        else if (findContact(newContact.getName()) != -1)
        {
            System.out.println("Contact with name " + newContact.getName() + " already exists. Update was not successful.");
            return false;
        }

        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact)
    {
        int foundPosition = findContact(contact);

        if (foundPosition < 0)
        {
            System.out.println(contact.getName() + ", was not found.");
            return false;
        }

        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() + ", was deleted.");
        return true;
    }

   private int findContact(Contact contact)
   {
       //returns an integer showing where the contact is located in the array for the particular ArrayList
       //If it is greater than 0 then it can determine whether it exists
       return this.myContacts.indexOf(contact);
   }

   private int findContact(String contactName)
   {
       for(int i = 0; i < this.myContacts.size(); i++)
       {
           Contact contact = this.myContacts.get(i);

           if(contact.getName().equals(contactName))
           {
               return i;
           }
       }

       return -1;
   }

   public String queryContact(Contact contact)
   {
       if (findContact(contact) >= 0)
       {
           return contact.getName();
       }
       return null;
   }

   //uses the class Contact as a return datatype
   public Contact queryContact(String name)
   {
       int position = findContact(name);
       if (position >= 0)
       {
           return this.myContacts.get(position);
       }

       return null;
   }

   public void printContacts()
   {
       System.out.println("Contact List");
       //This for loop navigates through the entire listing of contacts
       for (int i = 0; i < this.myContacts.size(); i++)
       {
           //This prints out the names and phone numbers
           //this.myContacts.get(i).getName() refers to the getter in the Contacts class
           //the .get(i) gets the integer indexed with the name and phone number
           System.out.println((i + 1) + "." + this.myContacts.get(i).getName() + " -> " + this.myContacts.get(i).getPhoneNumber());
       }
   }

}
