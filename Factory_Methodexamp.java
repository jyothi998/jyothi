package factory_method;

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
		System.out.println("Yamaha bike has a stand");
		
	}
	
}
class Honda extends Bike{

	@Override
	public void cost() {
		System.out.println("Cost of the honda is 85,000");
		
	}

	@Override
	public void speed() {
		System.out.println("Speed of honda is 40kmph");
		
	}

	@Override
	void stand() {
		System.out.println("Honda bike has a stand");
		
	}
	
}
class Audi extends Car{

	@Override
	public void cost() {
		// TODO Auto-generated method stub
		System.out.println("Audi cost is 50lakhs");
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

class Bmw extends Car{

	@Override
	public void cost() {
		System.out.println("Bmw cost is 50lakhs");
		
	}

	@Override
	public void speed() {
		System.out.println("Speed of the bmw is 50kmph");
		
	}

	@Override
	void bumpers() {
		System.out.println("Bmw has bumper");
		
	}
	
}
class BikeF{
	Bike getBike(String bike) {
		if(bike.equals("Yamaha"))return new Yamaha();
		else if(bike.equals("Honda"))return new Honda();
		return null;
	}
}
class Carf{
	Car getCar(String car) {
		if(car.equals("Audi"))return new Audi();
		else if(car.equals("Bmw"))return new Bmw();
		return null;
	}
}
class Factory_Methodexamp{
	public static void main(String[] args) {
		
	
BikeF bf = new BikeF();
Bike b =bf.getBike("Yamaha");
b.cost();
b.speed();
b.stand();
System.out.println("------------------------------");
Carf cf = new Carf();
Car c =cf.getCar("Audi");
c.cost();
c.speed();
c.bumpers();
}

}