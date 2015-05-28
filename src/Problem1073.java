import java.util.Scanner;

public class Problem1073 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		sc.close();
		
		System.out.println(getCertNumber(money));
	}

	private static int getCertNumber(int money) {
		int rem = (int) (Math.sqrt(money) % 1);
		if (rem == 0) return 1;
		return 1 + getCertNumber(money - rem*rem);
	}

}
