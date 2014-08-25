import java.util.*;
public class Naloga1 {

	public static final int ZAC_LETO = 0;
	
	static int[][] t = { {-50, 30, 20, 0, -60, -40, 0, 10},
				{10, -20, -6, 40, 25, 6, 18, 4},
				{-23, -15, -1, -5, -13, 0, -9 -3} };
	
	public static void main(String[]args){
		// part 1
		System.out.println(skupaj(t, 0));
		System.out.println();
		// part 2
		System.out.println(stPreobratov(t, 0));
		System.out.println();
		// part 3
		System.out.println(najZapNar(t, 0));
		System.out.println(najZapNar(t, 1));
		System.out.println(najZapNar(t, 2));
	}
	
	private static int skupaj(int[][] t, int leto){
		int skupaj = 0;
		for(int i = 0; i < t.length; i++) {
			skupaj += t[i][leto];
		}
		return skupaj;
	}
	
	private static int stPreobratov(int[][]t, int k){
		int change = 0;
		int prev = t[k][0];
		for(int i = 1; i < t[k].length; i++) {
			if(prev == 0 && t[k][i] < 0
				|| isPositive(prev) && !isPositive(t[k][i])
					|| !isPositive(prev) && isPositive(t[k][i])) {
				change++;
			}
			prev = t[k][i];
		}
		return change;
	}
	
	private static boolean isPositive(int num) { 
		return num >= 0 ? true : false;
	}
	
	private static int najZapNar(int[][] t, int k) {
		int length = 0;
		int max = length;
		for(int i = 0; i < t[k].length; i++) {
			if( t[k][i] > 0) {
				length++;
			} else {
				if(length > max) {
					max = length;
				}
				length = 0;
			}
		}
		if(length > max) {
			max = length;
		}
		return length;
	}
}
