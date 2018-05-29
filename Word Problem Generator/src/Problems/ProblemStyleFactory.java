package Problems;

import Objects.ProblemType;

/**
 * Created by Zeikar Park. 2013111995
 */
public abstract class ProblemStyleFactory
{
	// 해당 문제의 타입에 따른 팩토리를 리턴.
	public static ProblemStyleFactory getProblemStyleFactory(ProblemType type)
	{
		if (type == ProblemType.ADDITION)
		{
			return new AdditionProblemFactory();
		}
		else if (type == ProblemType.SUBTRACTION)
		{
			return new SubtractionProblemFactory();
		}
		else if (type == ProblemType.MULTIPLICATION)
		{
			return new MultiplicationProblemFactory();
		}
		else if (type == ProblemType.DIVISION)
		{
			return new DivisionProblemFactory();
		}
		
		return null;
	}
	
	public abstract Template getTemplate();
	
	public abstract Operation getOperation();
}
