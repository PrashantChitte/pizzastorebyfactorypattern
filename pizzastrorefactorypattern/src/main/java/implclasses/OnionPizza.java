package implclasses;

import demo.abstractclasses.AbstractPizza;

public class OnionPizza extends AbstractPizza {

	@Override
	public void preaparePizza() {
		System.out.println("Youre OnionPizza is preparing");

	}

	@Override
	public void bakePizza() {
		System.out.println("Youre OnionPizza is in baking process");

	}

	@Override
	public void cutPizza() {
		System.out.println("Youre OnionPizza is in cutting process");

	}

	@Override
	public void boxPizza() {
		System.out.println("Youre OnionPizza is in boxing process\n Have fun Enjoy ur time");

	}

}
