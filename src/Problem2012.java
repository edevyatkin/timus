import java.util.Scanner;

public class Problem2012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tasks = sc.nextInt();
		sc.close();
		if (tasks + 5 >= 12)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}
