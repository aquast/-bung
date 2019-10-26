/**
 * 
 */
package de.qterra.uebung.util;

import java.util.Scanner;

/**
 * @author aquast
 *
 */
public class InputGetter {

	public static int getInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ihre Eingabe > ");
		
		int eingabe = scanner.nextInt();

		return eingabe;
	}
}
