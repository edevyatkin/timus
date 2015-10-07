package com.edevyatkin.timus;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringJoiner;

/*
 * http://acm.timus.ru/problem.aspx?space=1&num=1069
 */

public class Problem1069 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		List<Integer> prufer = new ArrayList<>();
		while (sc.hasNextInt() == true) {
			Integer i = sc.nextInt();
			prufer.add(i);
		}
		sc.close();
		
		int[] degree = new int[prufer.size() + 2];
		Arrays.fill(degree, 0);
		
		for (Integer elem : prufer) {
			degree[elem]++;
		}
		
		PriorityQueue<Integer> leaves = new PriorityQueue<>();
		for (int i = 1; i < prufer.size()+2; i++) {
			if (degree[i] == 0) 
				leaves.add(i);
		}
		
		List<PriorityQueue<Integer>> result = new ArrayList<>();
		for (int i = 1; i < prufer.size()+2; i++) {
			result.add(new PriorityQueue<Integer>());
		}
		
		for (Integer code : prufer) {
			Integer minleaf = leaves.poll();
			
			result.get(code-1).add(minleaf);
			result.get(minleaf-1).add(code);
			
			degree[code]--;
			if (degree[code] == 0)
				leaves.add(code);
		}
		
		int i = 1;
		for (PriorityQueue<Integer> priorityQueue : result) {
			StringBuilder sb = new StringBuilder();
			sb.append(i++);
			sb.append(": ");
			
			StringJoiner sj = new StringJoiner(" ");
			for (Integer integer : priorityQueue) {
				sj.add(integer.toString());
			}
			sb.append(sj);
			
			System.out.println(sb);
		}
	}

}
