
public class Problem3
{
	public static void main(String[] args)
    {
        double givenNumber = 600851475143d;
        for (double primeFactor = 3; primeFactor < givenNumber; primeFactor += 2)
        {
            while (givenNumber % primeFactor == 0)
            {
                givenNumber = givenNumber / primeFactor;
            }
        }
        System.out.println((int)givenNumber);
    }
}
//Solved