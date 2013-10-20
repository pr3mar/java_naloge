package vaje2;

import java.util.Scanner;

public class Zgoscenke2 {
	public static void main(String[] args) {
		Scanner beri = new Scanner(System.in);
		int noPrazniCD, memorija, velicinaDatoteke, stCD;

		System.out.print("Stevilo praznih CD-jev: ");
		noPrazniCD = beri.nextInt();
		memorija = 0;
		stCD = 1;

		while (stCD <= noPrazniCD) {
			System.out.print("Velikost datoteke (v MB): ");
			velicinaDatoteke = beri.nextInt();
			if ((memorija + velicinaDatoteke) <= 700) {
				memorija += velicinaDatoteke;
				System.out
						.println("Datoteka se shrani na CD st. " + stCD
								+ ", ki trenutno vsebuje " + memorija
								+ " MB podatkov.");
			} else {
				memorija = velicinaDatoteke;
				if ((stCD + 1) <= noPrazniCD) {
					System.out.println("Datoteka se shrani na CD st. "
							+ (stCD + 1) + ", ki trenutno vsebuje " + memorija
							+ " MB podatkov.");
					stCD++;
				} else {
					System.out.println("CD-jev je zmanjkalo!");
					break;
				}
			}
		}
	}

}
