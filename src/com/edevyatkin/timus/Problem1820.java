package com.edevyatkin.timus;

import java.util.Scanner;

/*
 * http://acm.timus.ru/problem.aspx?space=1&num=1820
 */

public class Problem1820 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		sc.close();
		
		if (n > k) {
			int op = n*2;
			int res = op/k;
			int rem = op%k;
			if (rem > 0) res++;
			System.out.println(res);
		}
		else System.out.println(2);
	}

}
