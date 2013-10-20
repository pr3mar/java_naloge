/**
 * @author Marko Prelevikj
 * 
 */
package naloge2;

import java.util.Scanner;

public class VozniRed {
	public static void main(String[] args) {
		Scanner beri = new Scanner(System.in);
		int urZac, minZac, urKonc, minKonc, interval;

		System.out.print("Ura zacetka voznje: ");
		urZac = beri.nextInt();
		System.out.print("Minuta zacetka voznje: ");
		minZac = beri.nextInt();
		System.out.print("Ura konca voznje: ");
		urKonc = beri.nextInt();
		System.out.print("Minuta konca voznje: ");
		minKonc = beri.nextInt();
		System.out.print("Interval (v minutah): ");
		interval = beri.nextInt();
		System.out.printf("%d:%02d ", urZac, minZac);
		while (urZac < urKonc && urZac < 24) {
			minZac += interval;
			if (minZac >= 60) {
				urZac = urZac + (minZac / 60);
				minZac %= 60;
				if (urZac >= 24) {
					break;
				}
			}
			System.out.printf("%d:%02d ", urZac, minZac);
		}
	}
}
