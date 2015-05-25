import java.util.Scanner;
import java.util.Stack;

public class Problem1001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Long> st = new Stack<>(); 
		while(sc.hasNext()) {
			long n = sc.nextLong();
			st.push(Long.valueOf(n));
		}
		sc.close();

		while (!st.isEmpty()) {
			String ns = String.format("%.4f", Math.sqrt((double) st.pop()));
			System.out.println(ns);
		}
	}

}
