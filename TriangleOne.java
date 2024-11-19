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

		for (i=size; i>0; i--)
		{
			System.out.println(k);
			k+=let;
		}

		return output;
	}
}
