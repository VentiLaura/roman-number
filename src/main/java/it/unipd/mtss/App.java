////////////////////////////////////////////////////////////////////
// [Laura] [Venturini] [2101061]
// [Daniela] [Erba] [2111039]
////////////////////////////////////////////////////////////////////


package it.unipd.mtss;
import java.util.Scanner;
public class App
{
    public static void main( String[] args ) {
    Scanner input = new Scanner(System.in);
    System.out.print(RomanPrinter.print(input.nextInt()));
    }
}