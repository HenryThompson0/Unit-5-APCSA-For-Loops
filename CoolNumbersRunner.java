package Assigned;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import java.util.Scanner;

public class CoolNumbersRunner
{
	public static void main( String[] args )
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter your number: ");
		int choice = kb.nextInt();

		System.out.println( CoolNumbers.countCoolNumbers(choice) + " cool numbers between 6 - " + choice);
		//add more test cases

		kb.close();
	}
}
