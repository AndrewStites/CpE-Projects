package Java.MasterClass;

import java.util.Scanner;

public class X {
    public int x;

    public X(Scanner x) {
        System.out.println("Enter an Integer: ");
        this.x = x.nextInt();
    }

    public void x()
    {
        for (int x = 1; x < 13 ; x++)
        {
            System.out.println(x + " times " + this.x + " equals " + x * this.x);
        }
    }
}
