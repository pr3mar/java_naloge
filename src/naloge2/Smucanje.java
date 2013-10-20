/**
 * @author Marko Prelevikj
 * 
 */
package naloge2;

import java.util.Scanner;

public class Smucanje {

	public static void main(String[] args) {
		Scanner beri = new Scanner(System.in);
		int stTekmovalcev;
		int prviTek, drugiTek, tek, maxTek, tekmovalec;

		maxTek = Integer.MAX_VALUE;
		tekmovalec = -1;
		tek = 0;
		stTekmovalcev = beri.nextInt();

		for (int i = 1; i <= stTekmovalcev; i++) {
			System.out.println("Tekmovalec " + i);
			for (int j = 0; j < 2; j++) {
				if (j % 2 == 0) {
					System.out.print("\tVnesite cas v prvem teku: ");
					prviTek = beri.nextInt();
					if (prviTek == -1) {
						break;
					} else {
						tek += prviTek;
					}
				} else {
					System.out.print("\tVnesite cas v drugem teku: ");
					drugiTek = beri.nextInt();
					if (drugiTek == -1) {
						tek = 0;
						break;
					} else {
						tek += drugiTek;
					}
				}
			}

			if (tek < maxTek && tek != 0) {
				maxTek = tek;
				tekmovalec = i;
			}
			tek = 0;
		}
		if (maxTek > 0 && tekmovalec >= 1) {
			System.out.printf("Najboljsi cas (%d) je dosegel tekmovalec %d.%n",
					maxTek, tekmovalec);
		}
		else
		{
			System.out.println("Vse tekmovalce so diskvalificirali.");
		}

	}

}
