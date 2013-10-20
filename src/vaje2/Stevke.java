package vaje2;

import java.util.Scanner;

public class Stevke {

	public static void main(String[] args) {
		
		int stevilo, obratno;
		Scanner beri = new Scanner(System.in);

		System.out.print("Vnesi neko stevilo: ");
		stevilo = beri.nextInt();
		
		obratno = stevilo % 10;
		System.out.print(stevilo%10 + " ");
		stevilo /= 10;
		System.out.print(stevilo % 10 + " ");
		while (stevilo > 0) {
			obratno = obratno * 10 +  stevilo % 10;
			stevilo /= 10;
			System.out.print(stevilo%10 + " ");
		}
		
		System.out.printf("%n %d",obratno);
	}

}
