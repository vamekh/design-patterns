package ge.edu.ug.solid.isp.printer;

import org.junit.jupiter.api.Test;

class PrinterTest {
    @Test
    public void testIspGoodExample() {
        System.out.println("***A demo that follows ISP.***");
        Printer basicPrinter = new BasicPrinter();
        basicPrinter.print();
        AdvancedPrinter advancedPrinter = new AdvancedPrinter();
        advancedPrinter.print();
        advancedPrinter.sendFax();
    }
}
