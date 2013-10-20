package naloge1;

import java.util.Scanner;

public class PostevankaI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int stevilo, faktor;
		Scanner sc = new Scanner(System.in);
		System.out.print("Vnesite celo stevilo: ");
		stevilo = sc.nextInt();
		System.out.print("Vnesite pozitivno celo stevilo: ");
		faktor = sc.nextInt();
		if (faktor > 0) {
			for (int i = 1; i <= faktor; i++) {
				System.out.println(stevilo + " * " + i + " = "
						+ (stevilo * i));
			}
		} else {
			System.out.println("Stevilo ni pozitivno!");
		}
	}

}
