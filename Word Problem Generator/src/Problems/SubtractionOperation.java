package Problems;

/**
 * Created by Zeikar Park. 2013111995
 */
public class SubtractionOperation extends Operation
{
	@Override
	public boolean isAnswerCorrect(int num1, int num2, double answer)
	{
		return (Math.max(num1, num2) - Math.min(num1, num2)) == answer;
	}
}
