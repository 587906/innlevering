package no.hvl.dat100;
import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class Areal {
	public static void main (String[] arg) {
		String lengdeTxt = showInputDialog ("Lengde");
		String breddeTxt = showInputDialog ("Bredde");
		int lengde = parseInt (lengdeTxt);
		int bredde = parseInt (breddeTxt);
		int areal = lengde * bredde;
		String utTxt = "Arealet er " + areal;
		showMessageDialog (null, utTxt);
		
	
		
	}
}
