package Problems;

/**
 * Created by Zeikar Park. 2013111995
 */
public class DivisionProblemFactory extends ProblemStyleFactory
{
	@Override
	public Template getTemplate()
	{
		return new DivisionTemplate();
	}
	
	@Override
	public Operation getOperation()
	{
		return new DivisionOperation();
	}
}
