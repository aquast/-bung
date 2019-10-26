/**
 * 
 */
package de.qterra.uebung;

import java.util.Scanner;

/**
 * @author aquast
 *
 */
public class VariablenAuswertung {

	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ihre Eingabe > ");
	
		int eingabe = scanner.nextInt();

		System.out.println(++eingabe);
		System.out.println(eingabe);
		System.out.println(eingabe++);
		System.out.println("--------------------");

	}
}
