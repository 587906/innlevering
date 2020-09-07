package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
public class oppgåve5 {
	public static void main(String[] args) {
		int poengsum = Integer.parseInt (showInputDialog ("Skriv inn poengsum"));
		char karakter = ' ';
		
		
		if (poengsum <40) {
			karakter = 'F';
		}

		else if (poengsum <50) {
			karakter = 'E';
		}
		else if (poengsum <60) {
			karakter = 'D';
		}
		else if (poengsum <80) {
			karakter = 'C';
		}
		else if (poengsum <90) {
			karakter = 'B';
		}
		else karakter = 'A';
		
		showMessageDialog (null, "Karakteren din er " + karakter);
	}
	
}
