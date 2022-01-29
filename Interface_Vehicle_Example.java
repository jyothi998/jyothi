package loop_examples;

interface Vehicle{
	void cost();
	void speed();
}
abstract class Bike implements Vehicle{
	abstract void stand();
}
abstract class Car implements Vehicle{
	abstract void bumpers();
}
class Yamaha extends Bike{

	@Override
	public void cost() {
		System.out.println("Cost of the yamaha is 95,000");
		
	}

	@Override
	public void speed() {
		System.out.println("Speed of yamaha is 50kmph");
		
	}

	@Override
	void stand() {
		System.out.println("Yamaha bike has stand");
		
	}
	
}
class Audi extends Car{

	@Override
	public void cost() {
		// TODO Auto-generated method stub
		System.out.println("Audi cost is 500000");
	}

	@Override
	public void speed() {
		// TODO Auto-generated method stub
		System.out.println("Speed of the audi is 60kmph");
	}

	@Override
	void bumpers() {
		// TODO Auto-generated method stub
		System.out.println("Audi has bumper");
	}
	
}
public class Interface_Vehicle_Example {
public static void main(String[] args) {
	Bike b = new Yamaha();
	b.cost();
	b.speed();
	b.stand();
	System.out.println("====================================");
	Car c = new Audi();
	c.cost();
	c.speed();
	c.bumpers();
}
}
