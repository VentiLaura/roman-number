////////////////////////////////////////////////////////////////////
// [Laura] [Venturini] [2101061]
// [Daniela] [Erba] [2111039]
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;
public class RomanPrinter {
    public static void checkingInt(int number) {
            if (number>6) {
                throw new 
                IllegalArgumentException("Errore: input maggiore di 6");
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
  public static String print(int num){
    checkingInt(num);
  return printAsciiArt(IntegerToRoman.convert(num));
  }
  private static String printAsciiArt(String romanNumber){
    String[][] caratteriAscii = new String[6][2];
caratteriAscii[0] = new String[]{" ----- ","--      --"
};
caratteriAscii[1] = new String[]{"|_   _|","\\ \\    / /"};
caratteriAscii[2] = new String[]{"  | |  "," \\ \\  / / "};
caratteriAscii[3] = new String[]{"  | |  ","  \\ \\/ /  "};
caratteriAscii[4] = new String[]{" _| |_ ","   \\  /   "};
caratteriAscii[5] = new String[]{"|_____|","    \\/    "};

String result ="";

for (int i=0; i<=5&&!romanNumber.isEmpty(); i++) {
    for (String temp=romanNumber; !temp.isEmpty(); temp = temp.substring(1)) {
        char primoCarattere =temp.charAt(0);
        result=result+caratteriAscii[i][check(primoCarattere)]; 
    }
    result=result+"\n";
    }
    return result;
  }
  private static int check(char primoCarattere) {
        if (primoCarattere=='I') {
            return 0;}
        if (primoCarattere=='V') {
            return 1;}
        return 0; 
  }
  } 