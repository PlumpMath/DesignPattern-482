package decorator.designpattern.com;

public class Espresso extends Beverage {
	public Espresso() {
		description = "Esprssso";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1.99;
	}

}
