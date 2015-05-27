import java.util.Arrays;
import java.util.Scanner;

// wip

public class Problem1024 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] list1 = new int[sc.nextInt()];
		for (int i = 0; i < list1.length; i++) {
			list1[i] = sc.nextInt();
		}
		
		sc.close();
		
		int[] list2 = new int[list1.length];
		
		int order = getPertumationOrder(list1, list2, 1);
		System.out.println(order);
		
	}

	private static int getPertumationOrder(int[] list1, int[] list2, int order) {
		if (Arrays.equals(list1, list2))
			return order;
		for (int i = 0; i < list1.length; i++) {
			list2[i] = list1[list1[i]-1];
		}
		System.out.println(Arrays.toString(list2));
		return order+getPertumationOrder(list2, list1, order+1);
	}

}
