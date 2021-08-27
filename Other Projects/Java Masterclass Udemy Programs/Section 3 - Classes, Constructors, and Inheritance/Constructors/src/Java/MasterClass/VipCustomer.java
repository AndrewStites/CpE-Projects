package Java.MasterClass;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String email;

    //Empty Constructor for defaulting situations
    public VipCustomer()
    {
        this("leedle", 10000, "vip@gmail.com");
        System.out.println("Empty Constructor Called");
    }

    //Main Constructor
    public VipCustomer(String name, double creditLimit, String email)
    {
        System.out.println("Constructor called with parameters");

        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    //Constructor with one field defaulted
    public VipCustomer(double creditLimit, String email)
    {
        this("leedle", creditLimit, email);
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public double getCreditLimit() {
        return this.creditLimit;
    }

    public String getEmail() {
        return this.email;
    }
}
