package com.snakeladder;
import java.util.*;
public class SnakeLadder {
	int position;
	public static int number()
	{
	   Random random=new Random();
	   return random.nextInt(6);
	}	
	public int cases()
	{
	   Random random=new Random();
	   int result=random.nextInt(3);
	   return result;
	}
	public void play()
	{
		position=0;
		int count=0;
		while(position!=100)
		{
			int num=number();
			System.out.print("Number at roll:"+num+",   ");
		    count++;
		    int options=cases();
			System.out.print("Playing Option is:"+options+",   ");
			switch(options)
			{
			   case 0:
				   break;
			   case 1:
			   {
				   if(position+num+1<=100)
				   {
					   position= position+num+1;
					   break;
				   }
			   }
			   case 2:
			   {
				   if(position-num-1>=0)
				   {
					   	position= position-num-1;
					
				   }
				   else
				   {
					   position=0;
				   }
				   break;
			   }
			}
			System.out.println("The player is at now:"+position+" position");
		}
		System.out.println("The Player Won The Game In "+count +" Dice Rolls");
	}

	
	public static void main(String[] args) {
		SnakeLadder dc=new SnakeLadder();
		dc.play();
	}

}
