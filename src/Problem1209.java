import java.util.Scanner;

// wip

public class Problem1209 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		StringBuilder result = new StringBuilder();
		
		while (num > 0) {
			int x = sc.nextInt();
			if (1+4*(x-1) == x*x) {
				result.append(1);
			}
			else result.append(0);
			result.append(" ");
			num--;
		}
		
		System.out.println(result);
		sc.close();

	}

}
