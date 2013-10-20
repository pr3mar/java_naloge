package vaje2;

import java.util.Scanner;

public class EnostavenVozniREd {

	public static void main(String[] args) {
		int zacetek, konec, interval;
		Scanner beri = new Scanner(System.in);
		
		System.out.print("Zacetek: ");
		zacetek = beri.nextInt();
		System.out.print("Konec: ");
		konec = beri.nextInt();
		System.out.print("Interval: ");
		interval = beri.nextInt();
		
		while(zacetek <= konec){
			zacetek += interval;
			System.out.printf("%d:00 ",zacetek);
		}
	}
}
