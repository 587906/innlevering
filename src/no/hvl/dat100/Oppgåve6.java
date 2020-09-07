package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
public class Oppgåve6 {
	
	public static void main(String[] args) {
		int n = Integer.parseInt (showInputDialog ("Skriv eit heltall :)"));
		int svar = 1;
		
		if (n >= 0) {
			for (int i = 1; i <= n; i++) {
				svar = svar * i;
			}
			
			showMessageDialog( null, svar);
		}
		
		else {
			showMessageDialog(null, "Talet må være positivt");
		}
			
	}

}
