package com.edevyatkin.timus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * http://acm.timus.ru/problem.aspx?space=1&num=1893
 */

public class Problem1893 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder row = new StringBuilder();
		StringBuilder seat = new StringBuilder();
		
		int ch;
		while ((ch = br.read()) != -1) {
			if (Character.isDigit((char) ch)) 
				row.append((char) ch);
			if (Character.isAlphabetic((char) ch)) 
				seat.append((char) ch);
		}
		
		int arow = Integer.parseInt(row.toString());
		String aseat = seat.toString();
		if (arow < 3) {
			if (aseat.equals("A") || aseat.equals("D"))
				System.out.println("window");
			else if (aseat.equals("B") || aseat.equals("C"))
				System.out.println("aisle");
		} 
		else if (arow >= 3 && arow <= 20) {
			if (aseat.equals("A") || aseat.equals("F"))
				System.out.println("window");
			else if (aseat.equals("B") || aseat.equals("C") || aseat.equals("D") || aseat.equals("E"))
				System.out.println("aisle");
		}
		else if (arow >= 21 && arow <= 65) {
			if (aseat.equals("A") || aseat.equals("K"))
				System.out.println("window");
			else if (aseat.equals("C") || aseat.equals("D") || aseat.equals("G") || aseat.equals("H"))
				System.out.println("aisle");
			else if (aseat.equals("B") || aseat.equals("E") || aseat.equals("F") || aseat.equals("J"))
				System.out.println("neither");
		}
	}

}
