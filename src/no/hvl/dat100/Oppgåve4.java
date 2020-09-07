package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
public class Oppgåve4 {
	public static void main(String[] args) {
		int inntekt = Integer.parseInt (showInputDialog ("Skriv inn brutto"));
		double prosent = 0;
		
		if (inntekt <=180800) {
			prosent = 0;
			
		}
		
		else if (inntekt <254500) {
			prosent = 1.9;
		}
		
		else if (inntekt <639750) {
			prosent = 4.2;
		}
		
	else if (inntekt <999550) {
		prosent = 13.2;
		}
		
	else  {
		prosent = 16.2;
	}
		showMessageDialog(null, "Trinnskatt for " + inntekt + " blir " + prosent +"%" );
	}
}


