
public class Problem2
{
	public static void main(String[] args)
	{
		int sumOfEvenFibNumbers = 0;
		int fibValueOne = 0;
		int fibValueTwo = 1;
		int nextFibValue = fibValueOne + fibValueTwo;
		while (nextFibValue <= 4000000)
		{
			if (nextFibValue%2==0)
			{
				sumOfEvenFibNumbers = sumOfEvenFibNumbers + nextFibValue;
			}
			fibValueOne = fibValueTwo;
			fibValueTwo = nextFibValue;
			nextFibValue = fibValueOne + fibValueTwo;
		}
		System.out.println(sumOfEvenFibNumbers);
	}
}
//Solved