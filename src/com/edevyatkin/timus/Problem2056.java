package com.edevyatkin.timus;

import java.util.Scanner;

/*
 * http://acm.timus.ru/problem.aspx?space=1&num=2056
 */

public class Problem2056 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String result = "";

		int count = sc.nextInt();
		int mcount = count;
		int sum = 0;

		while (mcount > 0) {
			int mark = sc.nextInt();
			if (mark == 3) {
				result = "None";
			}
			sum += mark;
			mcount--;
		}
		sc.close();

		if (result.equals("") == true) {
			double avg = (double) sum / (double) count;
			if (avg == 5.0)
				result = "Named";
			else if (avg >= 4.5)
				result = "High";
			else
				result = "Common";
		}

		System.out.println(result);
	}

}
