import java.util.Scanner;

/*
 * http://acm.timus.ru/problem.aspx?space=1&num=1083
 */

public class Problem1083 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		
		String[] parts = str.split(" ");
		
		int number = Integer.parseInt(parts[0]);
		int factorials = parts[1].length();
		int result = 1;
		
		while (number > 0) {
			result *= number;
			number -= factorials;
		}
		
		System.out.println(result);
	}

}
