package Problems;

import java.util.Random;

/**
 * Created by Zeikar Park. 2013111995
 */
public class AdditionTemplate implements Template
{
	private final String[] template = {
			"#NAME1 has #NUM1 #ITEM. #NAME2 has #NUM2 #ITEM. " +
			"How many #ITEM do they have together?"
	};
	
	@Override
	public String makeTemplate(String personName1, String personName2, String itemName, int number1, int number2)
	{
		String result = template[new Random().nextInt(template.length)];
		
		result = result.replace("#NAME1", personName1);
		result = result.replace("#NAME2", personName2);
		result = result.replace("#ITEM", itemName);
		result = result.replace("#NUM1", Integer.toString(number1));
		result = result.replace("#NUM2", Integer.toString(number2));
		
		return result;
	}
}
