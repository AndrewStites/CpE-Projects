package Java.MasterClass;

public class Main {

    public static void main(String[] args) {
        //Challenge 1
        byte byteNum = 100;
        short shortNum = 1000;
        int intNum = 100000;
        long longSuperNum = 50000L + 10L * (byteNum + shortNum + intNum);
        System.out.println(longSuperNum);

        short shortTotal = (short) (1000 + 10 * (byteNum + shortNum + intNum));
    }
}
