package no.hvl.dat100;
import static java.lang.Math.sqrt;
import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
	
public class Vekslepenger {
   public static void main(String[] arg) {
      String Penger_inn = showInputDialog ("Skriv penger her");
      int Penger = parseInt (Penger_inn);
      int Pris = Penger - 15;
      String Ut = "Penger tilbake " + Pris;
      showMessageDialog (null, Ut);
      
      
   }
}
