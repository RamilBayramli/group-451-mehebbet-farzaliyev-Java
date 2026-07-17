package classwork_17;
public class Phone {
   String brand;
   String model;
   double battery;

Phone(String brand, String model, double battery) {
	this.brand = brand;
	this.model = model;
	this.battery = battery;
	
	void call(double duration) {
		double battery = duration / 10;
		if (battery > 0) {
			System.out.println("звонок");
			
		} else {
		System.out.println("звонок не идет ведь нет зарядки");	
		}
  }
}
  