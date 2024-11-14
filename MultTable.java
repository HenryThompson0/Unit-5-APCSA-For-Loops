package Assigned;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - 

public class MultTable
{
	private int number;
	private int stop;

	public MultTable(int multiplier, int amount)
	{
		number = multiplier;
		stop = amount;
		int i = 1;

		while(i <= stop)
		{
			System.out.println(multiplier + " multiplied by " + i + " equals " + (multiplier*i));
			i++;
		}
	}
}
