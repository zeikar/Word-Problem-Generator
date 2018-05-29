package Problems;

/**
 * Created by Zeikar Park. 2013111995
 */
public class AdditionProblemFactory extends ProblemStyleFactory
{
	@Override
	public Template getTemplate()
	{
		return new AdditionTemplate();
	}
	
	@Override
	public Operation getOperation()
	{
		return new AdditionOperation();
	}
}
