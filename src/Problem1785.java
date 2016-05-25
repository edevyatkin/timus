import java.util.Scanner;

/*
 * http://acm.timus.ru/problem.aspx?space=1&num=1409
 */

public class Problem1785 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		if (n>=1 && n<=4) System.out.println("few");
		if (n>=5 && n<=9) System.out.println("several");
		if (n>=10 && n<=19) System.out.println("pack");
		if (n>=20 && n<=49) System.out.println("lots");
		if (n>=50 && n<=99) System.out.println("horde");
		if (n>=100 && n<=249) System.out.println("throng");
		if (n>=250 && n<=499) System.out.println("swarm");
		if (n>=500 && n<=999) System.out.println("zounds");
		if (n>=1000) System.out.println("legion");
	}

}
