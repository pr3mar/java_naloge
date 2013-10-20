package naloge1;

import java.util.Scanner;

public class Uredi3 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int[] x = new int[3];
		int tmp;
		for (int i = 0; i < 3; i++) {
			x[i] = in.nextInt();
			for (int j = 0; j < i; j++) {
				if (x[i] < x[j]) {
					tmp = x[i];
					x[i] = x[j];
					x[j] = tmp;
				}
			}
		}

		System.out.print("Urejeno: ");
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}

	}

}
