import java.util.Scanner;

public class Problem1787 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		
		int ptraffic = k * n;
		int rtraffic = 0;
		while (n > 0) {
			int cars = sc.nextInt();
			rtraffic += cars;
			n--;
		}
		sc.close();
		System.out.println(rtraffic - ptraffic);
	}

}
