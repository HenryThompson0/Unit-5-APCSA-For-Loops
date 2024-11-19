package NewStuff;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class TriangleOne
{
   //this lab is setup with a single static method
   //there are no instance variables or additional methods / constructors

	public static String go( String let, int size)
	{
		String output="";
		int i = size;
		String k = let;

		while (i>0)
		{
			System.out.println(k);
			k+=let;
			i--;
		}

		return output;
	}
}
