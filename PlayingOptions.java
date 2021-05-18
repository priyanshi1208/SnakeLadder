package com.snakeladder;

import java.util.Random;

public class PlayingOptions{
	int position;
	int n;
	public int options()
	{
       int num=SnakeLadder.number();
	   Random random=new Random();
	   int result=random.nextInt(3);
	   System.out.println(result);
	   switch(result)
	   {
		   case 0:
			   n= position;
			   break;
		   case 1:
		   {
			   n= position+num+1;
			   break;
		   }
		   case 2:
		   {
			   	n= position-num-1;
			   	break;
		   }
		}
	   return n;
	   
	}	

}
