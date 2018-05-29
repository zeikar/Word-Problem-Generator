package Problems;

import Objects.ProblemType;

/**
 * Created by Zeikar Park. 2013111995
 */
public abstract class ProblemStyleFactory
{
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
		
		}
		else if (type == ProblemType.DIVISION)
		{
		
		}
		
		
		return null;
	}
	
	public abstract Template getTemplate();
	
	public abstract Operation getOperation();
}
