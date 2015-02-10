
public class Problem1
{
	public static void main(String[] args)
    {
    	int sum = 0;
    	for (int naturalNumbers = 1 ; naturalNumbers < 1000 ; naturalNumbers ++)
    	{
    		if (naturalNumbers % 3 == 0 || naturalNumbers % 5 == 0)
    		{
    			sum = sum + naturalNumbers;
    		}
    	}
    	System.out.println(sum);
    }
}
//Solved
