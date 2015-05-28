import java.util.Scanner;

public class Problem1877 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lock1 = sc.nextInt();
		int lock2 = sc.nextInt();
		sc.close();
		String result = (testLocks(lock1,lock2)) ? "yes" : "no";
		System.out.println(result);
	}

	private static boolean testLocks(int lock1, int lock2) {
		int badman = 0;
		boolean s = true;
		while (badman <= lock1 && badman <= lock2) {
			if (s == true) {
				if (badman == lock1) return true;
				s = false;
			}
			else {	
				if (badman == lock2) return true;
				s = true;
			}
			badman++;
		}
		return false;
	}

}
