package ge.edu.ug.solid.isp.printer;

import org.junit.jupiter.api.Test;

class PrinterTest {
    @Test
    public void testBadExample() {
        System.out.println("***A demo without ISP.***");
        Printer printer = new AdvancedPrinter();
        printer.print();
        printer.sendFax();
        printer = new BasicPrinter();
        printer.print();
        printer.sendFax(); // Will throw error
    }
}
