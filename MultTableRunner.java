package Assigned;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import java.util.Scanner;

public class MultTableRunner
{
	public static void main ( String[] args )
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("What number to multiply with? ");
		int multiplier = kb.nextInt();

		System.out.print("How many times to multiply? ");
		int amount = kb.nextInt();

		MultTable n = new MultTable(multiplier, amount);
	}
}
