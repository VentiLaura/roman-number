////////////////////////////////////////////////////////////////////
// [Laura] [Venturini] [2101061]
// [Daniela] [Erba] [2111039]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;
public class IntegerToRoman {
    public static void checking(int number) {
            if (number>1000) {
                throw new 
                IllegalArgumentException("Errore: input maggiore di 1000");
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

        int[] valori = {
            1000, 900, 500, 400,
             100,  90,  50,  40,
              10,   9,   5,   4,
               1
        };

        String[] valoriRomani = {
            "M", "CM", "D", "CD",
            "C", "XC", "L", "XL",
            "X", "IX", "V", "IV",
            "I"
        };

        for (int i = 0; i < valori.length; i++) {
            while (number >= valori[i]) {
                number -= valori[i];
                roman.append(valoriRomani[i]);
            }
        }

        return roman.toString();
    }
}