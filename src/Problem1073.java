import java.util.Scanner;

/*
 * http://acm.timus.ru/problem.aspx?space=1&num=1073
 */

public class Problem1073 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		sc.close();

		int[] dp = new int[money+1];
		for (int i = 0; i < dp.length; i++) {
			if (i == 4) break;
			dp[i] = i;
		}

		int level = (int) Math.sqrt(money);
		int[] areax2 = new int[level+2];
		for (int i = 1; i < areax2.length; i++) {
			areax2[i] = i*i;
		}
		
		int elem = 4;
		while (elem <= money) {
			int index = elem-1;
			int min = Integer.MAX_VALUE;
			int i = 1;
			while (index >= 0 ) {
				if (dp[index] < min) {
					min = dp[index];
				}
				index = elem-areax2[i];
				i++;
			}
			dp[elem] = min+1;
			elem++;
		}

		System.out.println(dp[money]);
	}

}


