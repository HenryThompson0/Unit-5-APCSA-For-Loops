package Assigned;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name

public class CoolNumbers 
{
	/*
	 *method isCoolNumber will return true if
	 *	num % 3-6 all have a remainder of 1
	 *it will return false otherwize
	 */
	public static boolean isCoolNumber( int num )
	{
        if((num%3==1)&&(num%4==1)&&(num%5==1)&&(num%6==1))
        {
            return true;
        }
        else
        {
            return false;
        }
	}
	
	/*
	 *method countCoolNumbers will return the count
	 *of the coolNumbers between 6 and stop
	*/
	public static int countCoolNumbers( int stop )
	{
        int i = stop;
        int coolNums=0;

        while(i>6)
        {
            if(isCoolNumber(i))
            {
                coolNums++;
            }
            i--;
        }

		return coolNums;
	}
}
