/**
 * @author Marko Prelevikj
 * 
 */
package naloge2;

import java.util.Scanner;

public class EvroShop {

	public static void main(String[] args) {
		int kovanca1, kovanca2;
		int buffer;
		Scanner beri = new Scanner(System.in);

		kovanca1 = 0;
		kovanca2 = 0;
		System.out.printf("Stanje v blagajni: %2d | %2d %n%n", kovanca1, kovanca2);

		while (true) {
			System.out.print("Vnesite placilo (1 ali 2): ");
			buffer = beri.nextInt();
			if (buffer % 2 == 0 && kovanca1 == 0) {
				System.out.println("Vracilo ni mogoce.");
				break;
			} else if (buffer % 2 == 0 && kovanca1 > 0) {
				kovanca1--;
				kovanca2++;
			} else {
				kovanca1++;
			}
			System.out.printf("Stanje v blagajni: %3d | %3d %n%n", kovanca1, kovanca2);
		}
	}

}
