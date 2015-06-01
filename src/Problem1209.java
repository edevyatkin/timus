import java.util.Scanner;

public class Problem1209 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		StringBuffer result = new StringBuffer();
		
		while (num > 0) {
			long x = sc.nextLong();
			double s = Math.sqrt(8*x-7);
			if (s % 1 == 0) 
					result.append("1"); 
				else 
					result.append("0");
			result.append(" ");
			num--;
		}
		
		System.out.println(result.toString().trim());
		sc.close();

	}

}
