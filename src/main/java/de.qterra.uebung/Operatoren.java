package übung;

public class Operatoren {

	public static void main (String[] args) {
		int a = 15;
		int b = 34;
		int c = 1;
		System.out.println("1: " + (a==b)); // Vergleichsoperator ergibt false
		System.out.println("2: " + (a==b-19)); // b-19 wird vor dem Vergleichsoperator gerechnet: true
		System.out.println("3: " + (a^b)); // a hoch b
		System.out.println("4: " + (a++^b)); // a hoch b  
		System.out.println("4a: " + a++); // a++
		System.out.println("4b: " + ++a); //  
		System.out.println("5: " + (7<<++c)); // 
		System.out.println("6: " + (a=b=c=0x10));
		System.out.println("7: " + (1e1));
	}
}
