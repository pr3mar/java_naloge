package prosti_broevi;

public class ProstiBroevi {

	private boolean jePrastevilo(int stevlika) {
		int d;
		d = 2;
		// <= Math.sqrt(stevilka)
		while (d <= (stevlika / 2)) {
			if (stevlika % d == 0)
				return false;
			d++;
		}
		return true;
	}

	public static void main(String[] args) {
		int n, st1, st2;
		ProstiBroevi xx = new ProstiBroevi();
		boolean x;
		x = true;
		n = 4;
		st1 = 2;
		System.out.print (n + ": ");
		
		while (x == true) {
			if (xx.jePrastevilo(st1) == true) {
				st2 = n - st1;
				if (xx.jePrastevilo(st2) == true) {
					System.out.print(st1 + "," + st2 + "; ");
				}
			}
			
			if (st1 == 2) {
				st1 += 1;
			} else {
				st1 += 2;
			}

			if (st1 <= (n / 2)) {
				continue;
			}
			n += 2;
			st1 = 2;
			if (n >= 101) {
				break;
			} else {
				System.out.print("\n" + n + ": ");
			}
		}
	}

}
