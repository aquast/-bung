/**
 * 
 */
package de.qterra.uebung;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author aquast
 *
 */
public class Primfaktorzerlegung {

	/**
	 * Die Main-Methode. Sie startet das Programm und ruft alle weiteren Klassen und Methoden auf.
	 * @param args
	 */
	public static void main(String[] args) {

		int ganzzahl = 0;
		if (args != null) {
			ganzzahl = Integer.parseInt(args[0]);
			System.out.println("Ihre Eingabe war: " + ganzzahl);
		} else {
			System.out.println("Sie müssen eine Ganzzahl als Programmargument mitgeben");
		}
        HashSet<Integer> faktoren = new HashSet<Integer>();
        faktoren = primFaktor(ganzzahl);
        
        StringBuffer result = new StringBuffer("Faktoren: ");
        Iterator<Integer> it = faktoren.iterator();
        while (it.hasNext()) {
        	result.append(it.next().toString() + " ");
        }
        System.out.println(result);
	}

	private static int findeNächsthöherePrim(int kandidat) {
		if (kandidat < 2 ) {
			kandidat = 2;
		}
		
		int rest = 1;
		int i = 2;
		while (i < kandidat) {
			while (rest != 0) {
				rest= kandidat % i;
//				System.out.println("kandidat: " + kandidat);
//				System.out.println("i: " + i);
//				System.out.println("rest: " + rest);
//				System.out.println("--------------------");
				i++;
			}
			if (rest == 0 && i < kandidat) {
				kandidat++;
				rest = 1;
				i=2;
			} else {
				return kandidat;
			}
			
		}
				
	return 2;
	}
	
	private static HashSet<Integer> primFaktor(int ganzzahl) {
		HashSet<Integer> faktoren = new HashSet<Integer>(); 
		int faktor = 0;
		int primzahl = 2;
		while (ganzzahl > 2) {
			while (ganzzahl % primzahl != 0) {
				primzahl = findeNächsthöherePrim(primzahl +1);
			}
			faktor = primzahl;
			System.out.println("Gefundener Primfaktor: " + faktor);
			ganzzahl = ganzzahl / faktor;
			System.out.println("aktuelles Divisionsergebnis: " + ganzzahl);
			faktoren.add(faktor);
		}
		return faktoren;
		
	}

}
