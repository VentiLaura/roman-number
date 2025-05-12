package it.unipd.mtss;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class RomanPrinterTest {
    @Test
  public void testRomanPrinterPrintRight() {
String valControllo=RomanPrinter.print(1);
assertEquals(" ----- \n|_   _|\n  | |  \n  | |  \n _| |_ \n|_____|\n", valControllo);
valControllo=RomanPrinter.print(5);
assertEquals("--      --\n\\ \\    / /\n \\ \\  / / \n  \\ \\/ /  \n   \\  /   \n    \\/    \n", valControllo);
valControllo=RomanPrinter.print(10);
assertEquals("--   --\n\\ \\ / /\n \\ V / \n  > <  \n / . \\ \n/_/ \\_\\\n", valControllo);
valControllo=RomanPrinter.print(50);
assertEquals(" -      \n| |     \n| |     \n| |     \n| |____ \n|______|\n", valControllo);
valControllo=RomanPrinter.print(100);
assertEquals("  ----- \n / ____|\n| |     \n| |     \n| |____ \n \\_____|\n", valControllo);
valControllo=RomanPrinter.print(500);
assertEquals(" -----  \n|  __ \\ \n| |  | |\n| |  | |\n| |__| |\n|_____/\n", valControllo);
valControllo=RomanPrinter.print(1000);
assertEquals(" --  -- \n|  \\/  |\n| \\  / |\n| |\\/| |\n| |  | |\n|_|  |_|\n", valControllo);
  }
//input illegali
@Test
public void testRomanPrinterInputDomain0() {
  Exception eccezione = assertThrows(IllegalArgumentException.class, () -> {
    RomanPrinter.print(0);
});
assertEquals("Errore: input uguale a 0", eccezione.getMessage());
}
@Test
public void testRomanPrinterInputDomain1001() {
  Exception eccezione = assertThrows(IllegalArgumentException.class, () -> {
    RomanPrinter.print(1001);
});
assertEquals("Errore: input maggiore di 1000", eccezione.getMessage());
}
@Test
public void testRomanPrinterInputDomainNegativo() {
  Exception eccezione = assertThrows(IllegalArgumentException.class, () -> {
    RomanPrinter.print(-10);
});
assertEquals("Errore: input minore di 0", eccezione.getMessage());
}
}