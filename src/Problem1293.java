import java.util.Scanner;

/*
 * http://acm.timus.ru/problem.aspx?space=1&num=1293
 */

public class Problem1293 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		System.out.println(n*a*b*2);
	}

}
