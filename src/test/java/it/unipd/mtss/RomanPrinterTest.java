package it.unipd.mtss;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class RomanPrinterTest {
    @Test
  public void testRomanPrinterPrintRight() {
String valControllo=RomanPrinter.print(1);
assertEquals(" ----- \n|_   _|\n  | |  \n  | |  \n _| |_ \n|_____|\n", valControllo);
valControllo=RomanPrinter.print(3);
assertEquals(" -----  -----  ----- \n"+
"|_   _||_   _||_   _|\n"+
"  | |    | |    | |  \n"+
"  | |    | |    | |  \n"+
" _| |_  _| |_  _| |_ \n"+
"|_____||_____||_____|\n", valControllo);
valControllo=RomanPrinter.print(5);
assertEquals("--      --\n\\ \\    / /\n \\ \\  / / \n  \\ \\/ /  \n   \\  /   \n    \\/    \n", valControllo);
valControllo=RomanPrinter.print(6);
assertEquals("--      -- ----- \n" +
  "\\ \\    / /|_   _|\n" +
  " \\ \\  / /   | |  \n" +
  "  \\ \\/ /    | |  \n" +
  "   \\  /    _| |_ \n" +
  "    \\/    |_____|\n",
  valControllo);
valControllo=RomanPrinter.print(10);
assertEquals("--   --\n\\ \\ / /\n \\ V / \n  > <  \n / . \\ \n/_/ \\_\\\n", valControllo);
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
public void testRomanPrinterInputDomainMagg10() {
  Exception eccezione = assertThrows(IllegalArgumentException.class, () -> {
    RomanPrinter.print(19);
});
assertEquals("Errore: input maggiore di 10", eccezione.getMessage());
}
@Test
public void testRomanPrinterInputDomainNegativo() {
  Exception eccezione = assertThrows(IllegalArgumentException.class, () -> {
    RomanPrinter.print(-10);
});
assertEquals("Errore: input minore di 0", eccezione.getMessage());
}
}