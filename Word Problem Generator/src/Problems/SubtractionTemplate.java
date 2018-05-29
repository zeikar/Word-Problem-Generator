package Problems;

import java.util.Random;

/**
 * Created by Zeikar Park. 2013111995
 */
public class SubtractionTemplate implements Template
{
	private final String[] template = {
			"#NAME1 has #NUM1 #ITEM. (He/she) gives #NUM2 #ITEM " +
					"to #NAME2 . How many #ITEM does #NAME1 have left?"
	};
	
	@Override
	public String makeTemplate(String personName1, String personName2, String itemName, int number1, int number2)
	{
		String result = template[new Random().nextInt(template.length)];
		
		result = result.replace("#NAME1", personName1);
		result = result.replace("#NAME2", personName2);
		result = result.replace("#ITEM", itemName);
		result = result.replace("#NUM1", Integer.toString(Math.max(number1, number2)));
		result = result.replace("#NUM2", Integer.toString(Math.min(number1, number2)));
		
		return result;
	}
}
