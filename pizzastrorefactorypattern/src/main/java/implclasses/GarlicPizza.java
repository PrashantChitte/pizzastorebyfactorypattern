package implclasses;

import demo.abstractclasses.AbstractPizza;

public class GarlicPizza extends AbstractPizza {

	@Override
	public void preaparePizza() {
		System.out.println("Youre GarlicPizza is preparing");

	}

	@Override
	public void bakePizza() {
		System.out.println("Youre GarlicPizza is in baking process\n Have fun Enjoy ur time");

	}

	@Override
	public void cutPizza() {
		// TODO Auto-generated method stub

	}

	@Override
	public void boxPizza() {
		// TODO Auto-generated method stub

	}

}
