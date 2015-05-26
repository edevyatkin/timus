import java.util.Scanner;

public class Problem1209 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		StringBuilder result = new StringBuilder();
		
		while (num > 0) {
			int x = sc.nextInt();
			int i = 1;
			while (x > 1) x-= i++;
			if (x == 1) 
					result.append(1); 
				else 
					result.append(0);
			result.append(" ");
			num--;
		}
		
		System.out.println(result.substring(0, result.length()-1));
		sc.close();

	}

}
