/**
 * @author Marko Prelevikj
 * 
 */

package naloge2;

import java.util.Scanner;

public class PiramidaStevil {

	public static void main(String[] args) {
		Scanner beri = new Scanner(System.in);
		int n;

		n = beri.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= (n - i); j++) {
				System.out.print(" ");
			}
			for (int j = 1, k = (i % 10); j <= (2 * i - 1); j++, k++) {
				System.out.print(k % 10);
			}
			System.out.println();
		}
	}

}
