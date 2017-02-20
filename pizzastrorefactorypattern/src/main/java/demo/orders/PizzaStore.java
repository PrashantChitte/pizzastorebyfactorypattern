package demo.orders;

import java.util.Scanner;

import demo.abstractclasses.AbstractPizza;
import factoryclasses.SimplePizzaFactory;

public class PizzaStore {

SimplePizzaFactory factory;

	

	public PizzaStore() {
	super();
	// TODO Auto-generated constructor stub
}

	public PizzaStore(SimplePizzaFactory factory) {
	super();
	this.factory = factory;
}

	public String orderPizza(String type)
	{
		
		
		AbstractPizza pizza=SimplePizzaFactory.createPizza(type);
		if(null==pizza)
			System.exit(0);
		else
		pizza.preaparePizza();
		pizza.bakePizza();
		pizza.cutPizza();
		pizza.boxPizza();
		
		return pizza.toString();
		
	}
	
	public static void main(String[] args) {
		PizzaStore ps=new PizzaStore();
		System.out.println("Enter Type of pizza:");
		Scanner sc=new Scanner(System.in);
		String typeofpizza=sc.next();	
		String.valueOf(ps.orderPizza(typeofpizza));
	}
}
