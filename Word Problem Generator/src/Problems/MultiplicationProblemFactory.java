package Problems;

/**
 * Created by Zeikar Park. 2013111995
 */
public class MultiplicationProblemFactory extends ProblemStyleFactory
{
	@Override
	public Template getTemplate()
	{
		return new MultiplicationTemplate();
	}
	
	@Override
	public Operation getOperation()
	{
		return new MultiplicationOperation();
	}
}
