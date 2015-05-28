import java.util.Scanner;

public class Problem1297 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int lindex = 0;
		int rindex = str.length()-1;
		sc.close();
		
		System.out.println(getMaxPalindrom(str, lindex, rindex, 0));
	}

	private static int getMaxPalindrom(String str, int lindex, int rindex, int plen) {
		if (lindex == rindex || (rindex-lindex == 1))
			return plen;
		
		return 0;
	}

}
