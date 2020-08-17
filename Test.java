package sarmabaruaabhigyan_OOP_05;

//Importing the Arraylist in Java
import java.util.ArrayList;

public class Test {
	//Main method
	public static void main(String[] args) {
		
		//Creating two Car objects to test the Car class implementing the taxable interface
		Car C1 = new Car("Audi", "Q7", 800);
		Car C2 = new Car("BMW", "B1", 1600);
		
		//Creating two Employee objects to test the Employee class implementing the PRSI and the taxable interfaces
		Employee E1 = new Employee("Tom Hardy", "THY3010048", 50000);
		Employee E2 = new Employee("Elsa Green", "EGN1234567", 15000);
		
		//Creating arraylists for all the four objects
		ArrayList<Taxable> arrayList= new ArrayList<Taxable>();
		arrayList.add(C1);
		arrayList.add(C2);
		arrayList.add(E1);
		arrayList.add(E2);
		
		//Calling the printTax method for all of the objects in the arraylist
		for (int i=0; i<arrayList.size(); i++) {
			arrayList.get(i).printTax();
			System.out.println();			//To create a gap between the information of each objects
		}

	}

}
