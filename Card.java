// Filename: Card.java
// Author: George
// Date: 2/6/19
// Class that defines the attributes and methods for a single playing card

public class Card
{
	private String suit;
	private int value;
	private String rank;
	
	// Mutator Methods (setters)
	public void setSuit(String s)
	{
		suit = s;
	}
	
	public void setValue(int num)
	{
		final int LOW = 1;
		final int HIGH = 13;
		
		if(num >= LOW && num <= HIGH)
		{
			value = num;
		}
		else
		{
			value = LOW;
		}

		switch(value){
			case 1: 
			 rank = "ACE";
			 break;
			 case 11: 
			 rank = "JACK";
			 break;
			 case 12: 
			 rank = "QUEEN";
			 break; 
			 case 13: 
			 rank = "KING";
			 default: 
			 rank = Integer.toString(value);
		}
}
	
	// Accessor Methods (getters)
	public String getSuit()
	{
		return suit;
	}
	
	public int getValue()
	{
		return value;
	}
	
	public String getRank()
	{
		return rank;
	}
	
		
}