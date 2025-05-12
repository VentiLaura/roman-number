////////////////////////////////////////////////////////////////////
// [Laura] [Venturini] [2101061]
// [Daniela] [Erba] [2111039]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;
public class IntegerToRoman {
    public static void checking(int number) {
            if (number>20) {
                throw new 
                IllegalArgumentException("Errore: input maggiore di 20");
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
        10,9,5,4,1};

        String[] valoriRomani = {
            "X", "IX", "V", "IV","I"};

        for (int i = 0; i < valori.length; i++) {
            while (number >= valori[i]) {
                number -= valori[i];
                roman.append(valoriRomani[i]);
            }
        }

        return roman.toString();
    }
}