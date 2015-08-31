import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Problem1880 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int count1 = sc.nextInt();
		Set<Integer> coll1 = new HashSet<>();
		while (count1 > 0) {
			coll1.add(sc.nextInt());
			count1--;
		}
		
		int count2 = sc.nextInt();
		Set<Integer> coll2 = new HashSet<>();
		while (count2 > 0) {
			coll2.add(sc.nextInt());
			count2--;
		}
		
		int count3 = sc.nextInt();
		Set<Integer> coll3 = new HashSet<>();
		while (count3 > 0) {
			coll3.add(sc.nextInt());
			count3--;
		}
		sc.close();
		
		coll1.retainAll(coll2);
		coll1.retainAll(coll3);

		System.out.println(coll1.stream().count());
	}

}
