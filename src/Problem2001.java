import java.util.Scanner;

public class Problem2001 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int math1 = sc.nextInt();
		int math2 = sc.nextInt();
		
		int math12 = sc.nextInt();
		int math2empty = sc.nextInt();
		
		int math1empty = sc.nextInt();
		int math21 = sc.nextInt();
		
		sc.close();
		
		StringBuilder sb = new StringBuilder();
		sb.append(math1-math1empty);
		sb.append(" ");
		sb.append(math2-math2empty);
		
		System.out.println(sb.toString());
	}

}
