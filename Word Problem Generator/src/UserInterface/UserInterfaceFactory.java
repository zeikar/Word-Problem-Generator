package UserInterface;

/**
 * Created by Zeikar Park. 2013111995
 */
public abstract class UserInterfaceFactory
{
	public static UserInterfaceFactory getUserInterfaceFactory(String interfaceType)
	{
		if(interfaceType.equals("CLI"))
		{
			return new CLIFactory();
		}
		
		return null;
	}
	
	// 입력 받는 InputManager 가져옴.
	public abstract InputManager getInputManager();
	
	// 출력하는 Renderer 가져옴.
	public abstract Renderer getRenderer();
}
