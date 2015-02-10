
public class Problem5
{
	public static void main(String[] args)
    {
		boolean completed = false;
		for (int smallestPosNum = 6 ; !completed ; smallestPosNum += 6)
		{
			boolean divisible = true;
			for (int divisor = 4 ; divisor <= 20 ; divisor ++)
			{
				if (smallestPosNum % divisor != 0)
				{
					divisible = false;
				}
			}
			if (divisible)
			{
				System.out.println(smallestPosNum);
				completed = true;
			}
		}
    }
}
//Solved
