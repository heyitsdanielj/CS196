
public class Problem6
{
	public static void main(String[] args)
	{
		int sumOfSquares = 1;
		int squareOfSum = 1;
		for (int naturalNumbers = 2 ; naturalNumbers <= 100 ; naturalNumbers ++)
		{
			sumOfSquares += (naturalNumbers * naturalNumbers);
		    squareOfSum += naturalNumbers;
		}
		long finalResult = (squareOfSum * squareOfSum) - sumOfSquares;
		System.out.println(finalResult);
	}
}
//Solved