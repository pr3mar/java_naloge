package naloge2;
/**
 * @author Marko Prelevikj
 * 
 */
import java.util.Scanner;

public class SprotnaStatistika {

	public static void main(String[] args) {
		double vnes, max, min, povprecje, stdOdklon;
		double vsota, vsotaKv, i;

		Scanner beri = new Scanner(System.in);
		max = Double.MIN_VALUE;
		min = Double.MAX_VALUE;
		povprecje = 0;
		vsota = 0;
		vsotaKv = 0;
		i = 1;
		System.out.print("Vnesite realno stevilo: ");
		vnes = beri.nextDouble();

		while (Double.isNaN(vnes) == false) {
			if (vnes < min) {
				min = vnes;
			}
			if (vnes > max) {
				max = vnes;
			}
			vsota += (vnes);
			vsotaKv += Math.pow(vnes, 2);
			povprecje = vsota / i;
			stdOdklon = Math.sqrt(vsotaKv / i - Math.pow(povprecje, 2));
			System.out.printf("%8.6f | %8.6f | %8.6f | %8.6f%n", max, min, povprecje,
					stdOdklon);
			System.out.print("Vnesite realno stevilo: ");
			vnes = beri.nextDouble();
			i++;
		}

	}
}
