package UserInterface;

/**
 * Created by Zeikar Park. 2013111995
 */
public class CLIFactory extends UserInterfaceFactory
{
	@Override
	public InputManager getInputManager()
	{
		return new CLIInputManager();
	}
	
	@Override
	public Renderer getRenderer()
	{
		return new CLIRenderer();
	}
}
