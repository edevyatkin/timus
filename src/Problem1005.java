import java.util.Scanner;

public class Problem1005 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int[] weights = new int[num];
		
		for (int i = 0; i < num; i++) {
			int j = i;
			weights[i] = sc.nextInt();
			while (j > 0 && weights[j] > weights[j-1]) {
				int temp = weights[j-1];
				weights[j-1] = weights[j];
				weights[j] = temp;
				j--;
			}
		}
		sc.close();
		
		
//		int heap1 = 0;
//		int heap2 = 0;
//		
//		
//		for (int i = 0; i < weights.length; i++) {
//			int stone = weights[i];
//			if (Math.abs(heap1 + stone - heap2) < Math.abs(heap2 + weights[i] - heap1))
//				heap1 += stone;
//			else 
//				heap2 += stone;
//
//		}
//		
//		int mindiff = Math.abs(heap1 - heap2);
//		System.out.println(mindiff);
		
		System.out.println(minweight(0, weights, 0, 0));
	}
	
	private static int minweight(int x, int[] stones, int heap1, int heap2) {
		if (x == stones.length) {
			return Math.abs(heap1-heap2);
		}
		else {
			return Math.min(
					minweight(x+1, stones, heap1+stones[x], heap2),
					minweight(x+1, stones, heap1, heap2+stones[x])
					);
		}
	}

}
