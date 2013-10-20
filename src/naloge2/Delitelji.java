/**
 * @author Marko Prelevikj
 * 
 */
package naloge2;

import java.util.Scanner;

public class Delitelji {

	public static void main(String[] args) {
		int stevilo;
		Scanner beri = new Scanner(System.in);
		System.out.print("Vnesite naravno stevilo n = ");
		stevilo = beri.nextInt();
		System.out.println();
		for (int i = 1; i <= stevilo; i++) {
			if (stevilo % i == 0){
				System.out.printf("%4d",i);
			}
		}
	}

}
