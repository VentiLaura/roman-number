////////////////////////////////////////////////////////////////////
// [Laura] [Venturini] [2101061]
// [Daniela] [Erba] [2111039]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;
public class IntegerToRoman {
    public static void checking(int number) {
            if (number>3) {
                throw new 
                IllegalArgumentException("Errore: input maggiore di 3");
            }
            if (number<0) {
                throw new 
                IllegalArgumentException("Errore: input minore di 0");
            }
            if (number==0){
                throw new 
                IllegalArgumentException("Errore: input uguale a 0");
            }
    }
  public static String convert(int number){
    checking(number);
        StringBuilder roman = new StringBuilder();
        for (int i = 0; number > 0; i++) {
                roman.append("I");
                number=number-1;
        }

        return roman.toString();
    }
}