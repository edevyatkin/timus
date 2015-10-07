import java.util.Arrays;
import java.util.Scanner;

/*
 * http://acm.timus.ru/problem.aspx?space=1&num=1024
 */

public class Problem1024 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] list1 = new int[sc.nextInt()];
		for (int i = 0; i < list1.length; i++)
			list1[i] = sc.nextInt();
		sc.close();
		
		int order = getPertumationOrder(list1, list1);
		System.out.println(order);
	}

	private static int getPertumationOrder(int[] list1, int[] list2) {
		if (Arrays.equals(list1, list2) && list1 != list2)
			return 0;
		
		int[] list3 = new int[list1.length];
		for (int i = 0; i < list2.length; i++) {
			int index = list2[i] - 1;
			list3[i] = list1[index];
		}
		
		list2 = null;
		
		return 1 + getPertumationOrder(list1, list3);
	}

}
