import java.util.Scanner;

public class Problem1118 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		sc.close();
		
		int n = 0;
		double mintriv = Double.MAX_VALUE;
		for (int k = i; k <= j; k++) {
			int sum = 1;
			for (int k2 = 2; k2 <= k / 2; k2++) {
				if (k % k2 == 0) {
					sum+= k2;
				}
			}
			double l = sum/k;
			if (l < mintriv ) {
				mintriv = l;
				n = k;
			}
		}
		
		System.out.println(n);
	}

}
