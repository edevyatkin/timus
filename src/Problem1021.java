import java.util.Scanner;

/*
 * http://acm.timus.ru/problem.aspx?space=1&num=1021
 */

public class Problem1021 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int l1 = sc.nextInt();
		int[] list1 = new int[l1];
		for (int i = 0; i < l1; i++) {
			list1[i] = sc.nextInt();
		}
		
		int l2 = sc.nextInt();
		int[] list2 = new int[l2];
		for (int i = 0; i < l2; i++) {
			list2[i] = sc.nextInt();
		}
		
		sc.close();		
		
		boolean hasSum10000 = false;
		int i = 0;
		int j = 0;
		while (i < l1 || j < l2){
				if (list1[i] + list2[j] == 10000) 
				{
					hasSum10000 = true;
					break;
				}
				if (list1[i] + list2[j] < 10000)
					if (i == l1-1) break; else i++;
				else
					if (j == l2-1) break; else j++;
		}
		
		System.out.println((hasSum10000 == true) ? "YES" : "NO");
		
	}
	
}
