import java.util.Scanner;

public class Problem1025 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int[] groups = new int[num];
		
		for (int i = 0; i < groups.length; i++) {
			int j = i;
			groups[i] = sc.nextInt();
			while (j > 0 && groups[j] < groups[j-1]) {
				int temp = groups[j-1];
				groups[j-1] = groups[j];
				groups[j] = temp;
				j--;
			}
		}
		sc.close();
		
		int count = 0;
		
		for (int i = 0; i < groups.length/2+1; i++) {
			count += groups[i]/2+1;
		}
		
		System.out.println(count);
		
//		ArrayList<Integer> list = new ArrayList<>();
//		while (sc.hasNext()) {
//			list.add(sc.nextInt());
//		}
//		
//		list.sort((a,b) -> (a < b) ? -1: 1);
//		
//		for (Integer integer : list) {
//			
//		}
//		
//		
//		System.out.println(list);
	}

}
