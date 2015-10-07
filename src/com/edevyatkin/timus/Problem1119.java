package com.edevyatkin.timus;

import java.util.Scanner;

public class Problem1119 {

	public static void main(String[] args) {
		final double side = 100;
		final double yardlen = Math.sqrt(side * side + side * side);

		Scanner scanner = new Scanner(System.in);
		final int n = scanner.nextInt();
		final int m = scanner.nextInt();

		boolean[][] yards = new boolean[m][n];

		int ycount = scanner.nextInt();

		while (ycount > 0) {
			int yn = scanner.nextInt();
			int ym = scanner.nextInt();
			yards[ym - 1][yn - 1] = true;
			ycount--;
		}
		scanner.close();

		double[] memoi = new double[n + 1];
		double[] memoj = new double[m + 1];

		int em = m;
		int en = n;

		memoi[n] = 0;
		memoj[m] = 0;

		int i = em;
		int j = en - 1;
		double min = Double.MAX_VALUE, top = 0, right = 0, cross = 0;

		while (em >= 0 && en >= 0) {
			while (j >= 0) {
				if (i == m) {
					right = memoi[j + 1];
					memoi[j] = side + right;
				} else {
					cross = (j == en) ? memoi[j + 1] : top;
					top = memoi[j];
					right = (j == en) ? memoj[i] : memoi[j + 1];
					if (yards[i][j] == false) {
						memoi[j] = side + Math.min(top, right);
					} else {
						min = side + Math.min(top, right);
						memoi[j] = Math.min(min, yardlen + cross);
					}
				}
				j--;
			}
			i = --em;
			j = en;

			while (i >= 0) {
				if (j == n) {
					top = memoj[i + 1];
					memoj[i] = side + top;
				} else {
					cross = (i == em) ? memoj[i + 1] : right;
					top = (i == em) ? memoi[j] : memoj[i + 1];
					right = memoj[i];
					if (yards[i][j] == false) {
						memoj[i] = side + Math.min(top, right);
					} else {
						min = side + Math.min(top, right);
						memoj[i] = Math.min(min, yardlen + cross);
					}
				}
				i--;
			}
			i = em;
			j = --en;
		}

		double weight = Math.max(memoi[0], memoj[0]);

		System.out.println(Math.round(weight));

	}

}
