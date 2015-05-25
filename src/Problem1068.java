import java.util.Scanner;

public class Problem1068 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		int sum = 0;

		if (n > 0)
			sum = n*(n+1)/2;
		else
			sum = (-n*(-n+1)/2-1)*-1;
		
		System.out.println(sum);
	}

}
