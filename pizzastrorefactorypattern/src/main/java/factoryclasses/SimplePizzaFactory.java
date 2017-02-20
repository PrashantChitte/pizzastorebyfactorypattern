/**
 * 
 */
package factoryclasses;

import constants.ConstantData;
import demo.abstractclasses.AbstractPizza;
import implclasses.CheesPizza;
import implclasses.GarlicPizza;
import implclasses.OnionPizza;

/**
 * @author PrashantChitte
 *
 */
public class SimplePizzaFactory {

	public static AbstractPizza createPizza(String type)
	{
		AbstractPizza pizza=null;
		if(ConstantData.CHEES.equalsIgnoreCase(type))
			pizza=new CheesPizza();
		else if(ConstantData.ONION.equalsIgnoreCase(type))
			pizza=new OnionPizza();
		else if(ConstantData.GARLIC.equalsIgnoreCase(type))
			pizza=new GarlicPizza();
		else
			System.out.println("Such pizza is not available with us sorry for inconvineance");
		return pizza;
		
	}
	
	
}
