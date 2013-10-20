package naloge1;

import java.util.Scanner;

public class Zaporedje {

	public static void main(String[] args) {

		int stevilo, meja, korak;
		Scanner sc = new Scanner(System.in);

		System.out.print("Vnesite zacetno stevilo: ");
		stevilo = sc.nextInt();
		System.out.print("Vnesite koncno mejo: ");
		meja = sc.nextInt();
		System.out.print("Vnesite korak: ");
		korak = sc.nextInt();

		if ((stevilo < meja) && (korak > 0)) {
			while (stevilo <= meja) {
				System.out.print(stevilo + " ");
				stevilo += korak;
			}
		} else if ((stevilo > meja) && (korak < 0)) {
			while (stevilo >= meja) {
				System.out.print(stevilo + " ");
				stevilo += korak;
			}
		} else if (korak == 0) {
			System.out.println("Korak ne sme biti enak 0.");
		} else {
			System.out.println("Predznak koraka ni usklajen s mejama.");
		}

	}
}
