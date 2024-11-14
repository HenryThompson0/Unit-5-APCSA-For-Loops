//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import java.util.Scanner;

public class FactorialRunner
{
	public static void main ( String[] args )
	{
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter your number: ");

        int choice = kb.nextInt();
        System.out.println(Factorial.getFactorial(choice));

        kb.close();
	}
}
