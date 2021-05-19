package com.snakeladder;

import java.util.*;

public class SnakeLadder {
	int position;

	public static int diceRollNumber() {
		 return new Random().nextInt(6)+1;
	}

	public int cases() {
		Random random = new Random();
		int result = random.nextInt(3);
		return result;	
	}

	public void play() {
		position = 0;
		int count = 0;
		while (position != 100) {
			int num = diceRollNumber();
			count++;
			int options = cases();
			switch (options) {
			case 0:
				break;
			case 1: {
				if (position + num <= 100) {
					position = position + num;		
					break;
				}
			}
			case 2: {
				if (position - num>= 0) {
					position = position - num;
						
				} else {
					position = 0;
				}
				break;
			}
			}
			System.out.print( position+" " );
		}
		System.out.println();
		System.out.println("The Player Won The Game In " + count + " Dice Rolls");
	}

	public static void main(String[] args) {
		SnakeLadder dc = new SnakeLadder();
		dc.play();
	}

}
