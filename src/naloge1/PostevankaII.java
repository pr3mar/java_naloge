package naloge1;

import java.util.Scanner;

public class PostevankaII {

	public static void main(String[] args) {
		int stevilo, limit, tmp, krat;
		Scanner sc = new Scanner(System.in);

		System.out.print("Vnesite pozitivno celo stevilo: ");
		stevilo = sc.nextInt();
		System.out.print("Vnesite zgornjo mejo: ");
		limit = sc.nextInt();
		krat = 1;
		tmp = stevilo * krat;
		while (tmp <= limit) {
			System.out.println(stevilo + " * " + krat + " = "
					+ tmp);
			krat++;
			tmp = (stevilo * krat);
		}
	}
}
