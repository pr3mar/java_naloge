package vaje2;

import java.util.Scanner;

public class Zgoscenke1 {

	public static void main(String[] args) {
		Scanner beri = new Scanner(System.in);
		int noPrazniCD, memorija, velicinaDatoteke;

		System.out.print("Stevilo praznih CD-jev: ");
		noPrazniCD = beri.nextInt();
		memorija = 0;

		for (int i = 1; i <= noPrazniCD; i++) {
			while (memorija <= 700) {
				System.out.print("Velikost datoteke (v MB): ");
				velicinaDatoteke = beri.nextInt();
				if ((memorija + velicinaDatoteke) <= 700) {
					memorija += velicinaDatoteke;
					System.out.println("Datoteka se shrani na CD st. " + i
							+ ", ki trenutno vsebuje " + memorija
							+ " MB podatkov.");
				} else {
					memorija = velicinaDatoteke;
					if ((i + 1) <= noPrazniCD) {
						System.out.println("Datoteka se shrani na CD st. "
								+ (i + 1) + ", ki trenutno vsebuje " + memorija
								+ " MB podatkov.");
					} else {
						System.out.println("CD-jev je zmanjkalo!");
						System.exit(0);
					}
					break;
				}
			}
		}
	}

}
