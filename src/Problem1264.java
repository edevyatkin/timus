import java.util.Scanner;

/*
 * http://acm.timus.ru/problem.aspx?space=1&num=1264
 */

public class Problem1264 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		
		System.out.println(n*(m+1));
	}

}
