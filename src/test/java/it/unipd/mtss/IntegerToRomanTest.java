package it.unipd.mtss;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class IntegerToRomanTest {
  @Test
  public void testIntegerToRomanRight() {
String valControllo=IntegerToRoman.convert(1);
assertEquals("I", valControllo);
valControllo=IntegerToRoman.convert(2);
assertEquals("II", valControllo);
valControllo=IntegerToRoman.convert(3);
assertEquals("III", valControllo);
valControllo=IntegerToRoman.convert(4);
assertEquals("IV", valControllo);
valControllo=IntegerToRoman.convert(5);
assertEquals("V", valControllo);
valControllo=IntegerToRoman.convert(6);
assertEquals("VI", valControllo);
  }
//input illegali
@Test
public void testIntegerToRomanInputDomain0() {
  Exception exception = assertThrows(IllegalArgumentException.class, () -> {
    IntegerToRoman.convert(0);
});
assertEquals("Errore: input uguale a 0", exception.getMessage());
}
@Test
public void testIntegerToRomanInputDomainMagg6() {
  Exception exception = assertThrows(IllegalArgumentException.class, () -> {
    IntegerToRoman.convert(7);
});
assertEquals("Errore: input maggiore di 6", exception.getMessage());
}
@Test
public void testIntegerToRomanInputDomainNegative() {
  Exception exception = assertThrows(IllegalArgumentException.class, () -> {
    IntegerToRoman.convert(-1);
});
assertEquals("Errore: input minore di 0", exception.getMessage());
}
@Test
    public void testIntegerToRomanInputHighValues() {
      String valControllo=IntegerToRoman.convert(6);
assertEquals("VI", valControllo);
    }
}