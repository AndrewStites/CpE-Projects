package Java.MasterClass;

public class Main {

    public static void main(String[] args) {

        ComputerPrinter hpPrinter = new ComputerPrinter(50, false);
        System.out.println("Initial page count " + hpPrinter.getPagesPrinted());
        int pagesPrinted = hpPrinter.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for print = " + hpPrinter.getPagesPrinted());
        pagesPrinted = hpPrinter.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for print = " + hpPrinter.getPagesPrinted());

    }
}
