package com.javapractice.day4;

import java.util.Random;

public class SnakeAndLadder {

	public static void main(String[] args) {

		System.out.println("SNAKE AND LADDER GAME");
		System.out.println("Welcome");
		System.out.println("Player 1:");
		int count_p1 = count();
		System.out.println("Player 2:");
		int count_p2 = count();
		if (count_p1 < count_p2)
			System.out.println("Player 1 wins");
		else if (count_p1 > count_p2)
			System.out.println("Player 2 wins");
		else
			System.out.println("Match is draw");
	}

	static int count() {
		Random random = new Random();
		int position = 0;
		int count = 0;
		do {
			count++;
			int dice = random.nextInt(6) + 1;
			Random r = new Random();
			String[] opr = { "No_Play", "Ladder", "Snake" };
			int r_opr = r.nextInt(opr.length);

			switch (opr[r_opr]) {
			case "No_Play":
				break;
			case "Ladder":
				if (position + dice <= 100)
					position += dice;
				break;
			case "Snake":
				if (position - dice < 0)
					position = 0;
				break;
			}
			System.out.println("New Position is:" + position);
		} while (position != 100);

		System.out.println("count: " + count);
		return count;

	}
}
