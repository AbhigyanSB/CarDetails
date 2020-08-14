package sarmabaruaabhigyan_OOP_05;

//The Employee class implementing the taxable and prsi interfaces
public class Employee implements Taxable, PRSI {

	//Creating three private fields to store the employee name, pps number and annual salary
	private String name;
	private String pps;
	private int salary;
	
	//Constructor against the three private fields
	public Employee(String name, String pps, int salary) {
		this.name = name;
		this.pps = pps;
		this.salary = salary;
	}

	//Method to calculate the Tax
	public double calculatePRSI() {
		//Declaring the PRSI variable as double
		double PRSI;
		//Conditions for the PRSI amount depending upon the weekly salary
		if((salary/52)<352) {			//COnsidering that there are 52 weeks in a year
			PRSI = 0;
		}
		else {
			PRSI = salary*rate;
		}
		return PRSI;				//Returning PRSI from this method
	}
	
	//Method to calculate the Tax
	public double calculateTax() {
		//Declaring the tax variable as double
		double tax;
		//Conditions for the tax amount with depending upon the annual salary amount
		if(salary<=33800) {
			tax = salary*0.2;
		}
		else {
			tax = salary*0.4;
		}
		return tax;				//Returning the tax from this method
	}

	//Method to print out the tax, along with the make, model and engine size
	public void printTax() {
		System.out.println("The PRSI is = "+calculatePRSI());
		System.out.println("The tax is = "+calculateTax());
		System.out.println("The name of the person is = "+this.name);
		System.out.println("The PPS number against the person is = "+this.pps);
	}

}
