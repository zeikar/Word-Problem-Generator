package Problems;

/**
 * Created by Zeikar Park. 2013111995
 */
public class MultiplicationOperation implements Operation
{
	@Override
	public boolean isAnswerCorrect(int num1, int num2, double answer)
	{
		return (num1 * num2) == answer;
	}
}
