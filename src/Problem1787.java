import java.util.Scanner;

public class Problem1787 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		
		int jam = 0;
		while (n > 0) {
			int cars = sc.nextInt();
			cars += jam;
			jam = (cars - k > 0) ? cars - k: 0;
			n--;
		}
		sc.close();
		System.out.println(jam);
	}

}
