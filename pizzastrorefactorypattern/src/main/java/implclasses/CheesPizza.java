/**
 * 
 */
package implclasses;

import demo.abstractclasses.AbstractPizza;

/**
 * @author PrashantChiite
 *
 */
public class CheesPizza extends AbstractPizza {

	/* (non-Javadoc)
	 * @see demo.abstractclasses.AbstractPizza#preaparePizza()
	 */
	@Override
	public void preaparePizza() {
		System.out.println("  Youre CheesPizza is preparing  ");

	}

	/* (non-Javadoc)
	 * @see demo.abstractclasses.AbstractPizza#bakePizza()
	 */
	@Override
	public void bakePizza() {
		System.out.println("Youre CheesPizza is in baking process");

	}

	/* (non-Javadoc)
	 * @see demo.abstractclasses.AbstractPizza#cutPizza()
	 */
	@Override
	public void cutPizza() {
		System.out.println("Youre CheesPizza is in cutting process");

	}

	/* (non-Javadoc)
	 * @see demo.abstractclasses.AbstractPizza#boxPizza()
	 */
	@Override
	public void boxPizza() {
		System.out.println("Youre CheesPizza is in boxing process\n Have fun Enjoy ur time");

	}

}
