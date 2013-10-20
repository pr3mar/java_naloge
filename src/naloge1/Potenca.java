package naloge1;

import java.util.Scanner;

public class Potenca {
	public static void main(String[] args) {
		int exponent, osnova, rez;
		Scanner in = new Scanner(System.in);
		System.out.print("Vnesite osnovo (>=1):");
		osnova = in.nextInt();
		System.out.print("Vnesite exponent (>=0):");
		exponent = in.nextInt();
		rez = (int) Math.pow(osnova, exponent);
		System.out.println(osnova + " ^ " + exponent + " = " + rez);
	}
}
