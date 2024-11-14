 //(c) A+ Computer Science
//www.apluscompsci.com
//Name

public class Factorial
{
	public static long getFactorial( int num )
	{
        long factorial=1;
        while(num>0)
        {
            factorial*=num;
            num--;
        }
		return factorial;
	}
}
