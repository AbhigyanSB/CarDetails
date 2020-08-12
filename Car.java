package sarmabaruaabhigyan_OOP_05;

//The Car class implementing the taxable interface
public class Car implements Taxable {

	//Creating three private fields to store the car make, car model and engine number
	private String make;
	private String model;
	private int engine;
	
	//Constructor against the three private fields
	public Car(String make, String model, int engine) {
		this.make = make;
		this.model = model;
		this.engine = engine;
	}

	//Method to calculate the Tax
	public double calculateTax() {
		//declaring the tax variable as double
		double tax;
		//Conditions for the tax amount depending upon the engine size
		if(engine<1000) {
			tax = 200;
		}
		else if(engine<=2000) {
			tax = 900;
		}
		else {
			tax = 1800;
		}
		return tax;				//Returning the Tax from this method		
	}
	
	//Method to print out the tax, along with the make, model and engine size
	public void printTax() {
		System.out.println("The tax against the car is = "+calculateTax());
		System.out.println("The make of the car is = "+this.make);
		System.out.println("The model the car is = "+this.model);
		System.out.println("The engine the car (in cc) is = "+this.engine);
	}

}
