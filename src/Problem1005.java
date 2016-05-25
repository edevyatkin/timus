import java.util.Scanner;

/*
 * http://acm.timus.ru/problem.aspx?space=1&num=1005
 */

public class Problem1005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int[] weights = new int[num];

		for (int i = 0; i < num; i++) {
			weights[i] = sc.nextInt();
		}

		sc.close();

		System.out.println(minweight(weights, 0, 0, 0));
	}

	private static int minweight(int[] stones, int x, int heap1, int heap2) {
		if (x == stones.length) {
			return Math.abs(heap1 - heap2);
		}
		return Math.min(minweight(stones, x + 1, heap1 + stones[x], heap2),
				minweight(stones, x + 1, heap1, heap2 + stones[x]));
	}

}
