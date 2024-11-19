package NewStuff;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class TriangleWord
{
   private String word;

	public TriangleWord(String w)
	{
		word=w;

		System.out.println("   "+word.charAt(0));
		System.out.println(" "+word.charAt(1)+"  "+word.charAt(1));
		System.out.print(reverse());
		System.out.print(word.substring(1,word.length()));


	}

	public String reverse()
	{
		String reversed = "";
		String newWord = word;

		while (newWord.length()>0)
		{
			reversed += newWord.charAt(newWord.length()-1);
			newWord = newWord.substring(0, newWord.length()-1);
		}

		return reversed;
	}

	public String toString()
	{
		String output="";
		return output+"\n";
	}
}
