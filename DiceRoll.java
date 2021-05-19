package com.snakeladder;
import java.util.*;

public class DiceRoll 
{
	public int number()
	{
	   Random random=new Random();
	   return random.nextInt(6)+1;
	}	
}
