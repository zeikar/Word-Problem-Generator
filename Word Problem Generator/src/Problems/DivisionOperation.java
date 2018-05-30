package Problems;

/**
 * Created by Zeikar Park. 2013111995
 */
public class DivisionOperation implements Operation
{
	@Override
	public boolean isAnswerCorrect(int num1, int num2, double answer)
	{
		// 나머지가 존재할 때
		int n1 = Math.max(num1, num2);
		int n2 = Math.min(num1, num2);
		
		if(n1 % n2 != 0)
		{
			// 실수 체크.
			// 오차가 0.1 이하이면 정답.
			return Math.abs((double) n1 / n2 - answer) <= 0.1;
		}
		
		return n1 / n2 == answer;
	}
}
