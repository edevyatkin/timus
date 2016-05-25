import java.util.Arrays;
import java.util.Scanner;

public class Problem1617 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int pairs = scanner.nextInt();
		
		int[] box = new int[101];
		Arrays.fill(box, 0);
		
		int cars = 0;
		
		while (pairs > 0 && scanner.hasNextInt()) {
			int diam = scanner.nextInt();
			int index = diam-600;
			if (box[index] == 3) {
				box[index] = 0;
				cars++;
			}
			else 
				box[index]++;
			pairs--;
		}
		scanner.close();
		
		System.out.println(cars);
	}

}
