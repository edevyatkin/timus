import java.util.Scanner;

public class Problem1118 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		sc.close();
		
		int n = 0;
		double mintriv = Double.MAX_VALUE;
		// for (int k = i; k <= j; k++) {
		// int sum = 1;
		// for (int k2 = 2; k2 <= k / 2; k2++) {
		// if (k % k2 == 0) {
		// sum+= k2;
		// }
		// }
		// double l = sum/k;
		// if (l < mintriv ) {
		// mintriv = l;
		// n = k;
		// }
		// }
		double l = 0;
		for (int k = i; k <= j; k++) {
			l = Sum(k) / (double) k;
			if (l < mintriv ) {
				mintriv = l;
				n = k;
			}
		}
		
		System.out.println(n);
	}

	private static long Sum(long a) {
		long sum = 1, k = 1, i;
		if (a == 1)
			return a;
		while ((a & 1) == 0) {
			k <<= 1;
			a >>= 1;
		}
		k = (k << 1) - 1;
		if (a == 1)
			return k;
		else
			sum = k;
		for (i = 3; i * i <= a; i += 2) {
			k = 1;
			while (a % i == 0) {
				k *= i;
				a /= i;
			}
			if (k > 1)
				sum *= ((k * i) - 1) / (i - 1);
		}
		if (a > 1)
			sum *= a + 1;
		return sum;
	}

}
