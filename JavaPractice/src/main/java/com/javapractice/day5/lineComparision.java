package com.javapractice.day5;

import java.util.Scanner;

public class lineComparision {

	public static void main(String[] args) {
		System.out.println("Welcome to Line comparision computation program");
		Scanner cor = new Scanner(System.in);
		System.out.println("Length of line is:" + length(cor));
	}

	public static double length(Scanner cor) {
		System.out.println("Enter x1:");
		int x1 = cor.nextInt();
		System.out.println("Enter y1:");
		int y1 = cor.nextInt();
		System.out.println("Enter x2:");
		int x2 = cor.nextInt();
		System.out.println("Enter y2:");
		int y2 = cor.nextInt();
		double len = Math.sqrt((x1 - x2) ^ 2 + (y1 - y2) ^ 2);
		return len;
	}
}