import java.util.Scanner;

public class Problem1021 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] list1 = new int[sc.nextInt()];
		for (int i = 0; i < list1.length; i++) {
			list1[i] = sc.nextInt();
		}
		
		int[] list2 = new int[sc.nextInt()];
		for (int i = 0; i < list2.length; i++) {
			list2[i] = sc.nextInt();
		}
		
		sc.close();
		
		String str = (hasSum10000Brut(list1,list2,0,0)) ? "YES" : "NO";
		//String str = (hasSum10000(list1,list2)) ? "YES" : "NO";
		System.out.println(str);
		
	}

	private static boolean hasSum10000(int[] list1, int[] list2) {
		for (int i = 0; i < list1.length; i++) {
			for (int j = 0; j < list2.length; j++) {
				if (list1[i] + list2[j] == 10000) return true;
				if (list1[i] + list2[j] < 10000) break;
			}
		}
		return false;
	}

	private static boolean hasSum10000Brut(int[] list1, int[] list2, int i, int j) {
		if (i == list1.length || j == list2.length) 
			return false;
		if (list1[i] + list2[j] == 10000) 
			return true;
		return hasSum10000Brut(list1, list2, i+1, j) || 
				hasSum10000Brut(list1, list2, i, j+1);
	}

}
