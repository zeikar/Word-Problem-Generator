package Problems;

/**
 * Created by Zeikar Park. 2013111995
 */
public class SubtractionProblemFactory extends ProblemStyleFactory
{
	@Override
	public Template getTemplate()
	{
		return new SubtractionTemplate();
	}
	
	@Override
	public Operation getOperation()
	{
		return new SubtractionOperation();
	}
}
