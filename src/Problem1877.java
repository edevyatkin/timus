import java.util.Scanner;

/*
 * http://acm.timus.ru/problem.aspx?space=1&num=1877
 */

public class Problem1877 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lock1 = sc.nextInt();
		int lock2 = sc.nextInt();
		sc.close();
		
		String result = (lock1 % 2 == 0 || lock2 % 2 == 1) ? "yes" : "no";
		System.out.println(result);
	}

}
