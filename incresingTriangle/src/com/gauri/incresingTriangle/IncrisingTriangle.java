package com.gauri.incresingTriangle;

public class IncrisingTriangle {
	public static void main(String args[]) {
		int i, j, row = 100;
		for (i = 1; i <= row; i++) {
			System.out.print(i);
			for (j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}
