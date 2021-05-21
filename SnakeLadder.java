package com.snakeladder;


import java.util.*;

public class SnakeLadder {
	
	int position;
	public static int number()
	{
	   Random random=new Random();
	   return random.nextInt(6);
	}	
	
	public void play()
	{
		position=0;
		while(position!=100)
		{
			int num=number();
		    
			int options=cases();
			switch(options)
			{
			   case 0:
				   break;
			   case 1:
			   {
				   if(position+num<=100)
				   {
					   position= position+num+1;
					   break;
				   }
			   }
			   case 2:
			   {
				   if(position+num<=0)
				   {
					   	position= position-num-1;
					   	break;
				   }	
			   }
			}
		}
		System.out.println(position);
	}
	

	public static int diceRollNumber() {
		return new Random().nextInt(6) + 1;
	}

	public int cases() {
		return new Random().nextInt(3);
	}

	public int play(int position) {
		int num = diceRollNumber();
		//System.out.println(num);
		int options = cases();
		//System.out.println(options);
		switch (options) {
		case 0:
			break;
		case 1: {
			if (position + num <= 100) {
				position = position + num;
				play(position);
				break;
			}
		}
		case 2: {
			if (position - num >= 0) {
				position = position - num;

			} else 
				position = 0;
			break;
		}
		}
		return position;
	}

	public static void main(String[] args) {
		 int positionPlayer1 = 0;
	     int positionPlayer2 = 0;
		SnakeLadder dc = new SnakeLadder();
		while (positionPlayer1 != 100 || positionPlayer2 != 100) {
			if(positionPlayer1==100||positionPlayer2==100) break;
			positionPlayer1=dc.play(positionPlayer1);
			System.out.println(positionPlayer1);
			positionPlayer2=dc.play(positionPlayer2);
			System.out.println(positionPlayer2);
		}
		System.out.println(positionPlayer1+ " "+positionPlayer2);
		if (positionPlayer1 == 100)
			System.out.println("Player 1 won the game");

		else if(positionPlayer2==100)
			System.out.println("Player 2 won the game");

		//SnakeLadder dc=new SnakeLadder();
		dc.play();
	}



	

	

}
