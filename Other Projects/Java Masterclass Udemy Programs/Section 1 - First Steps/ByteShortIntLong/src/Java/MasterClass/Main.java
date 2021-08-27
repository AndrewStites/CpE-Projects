package Java.MasterClass;

public class Main {

    public static void main(String[] args) {

        int myValue = 1000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Minimum Value = " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        System.out.println("Busted MIN value = " + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;
        
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Maximum Value = " + (myMaxByteValue + 1));
        System.out.println("Byte Minimum Value = " + (myMinByteValue - 1));

        short myMinshortValue = Short.MIN_VALUE;
        short myMaxshortValue = Short.MAX_VALUE;
        System.out.println("short Maximum Value = " + (myMaxshortValue + 1));
        System.out.println("short Minimum Value = " + (myMinshortValue - 1));
        
        long myLongValue = 100L;

        long myMinlongValue = Long.MIN_VALUE;
        long myMaxlongValue = Long.MAX_VALUE;
        System.out.println("long Maximum Value = " + (myMaxlongValue + 1));
        System.out.println("long Minimum Value = " + (myMinlongValue - 1));
        long bigLongLiteralValue = 2_147_483_647L;
        System.out.println(bigLongLiteralValue);

        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte)(myMinByteValue / 2);

        short myNewShortValue = (short) (myMinshortValue / 2);
    }
}
