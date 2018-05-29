package UserInterface;

/**
 * Created by Zeikar Park. 2013111995
 */
public class CLIRenderer implements Renderer
{
	@Override
	public void draw(String str)
	{
		System.out.println(str);
	}
}
