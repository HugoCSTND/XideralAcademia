import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) {
		 
		ArrayList<HamburgerTruck> TypesHamburgers = new ArrayList<>();
		 
		 TypesHamburgers.add(new BeaconHamburger("Beacon"));
	     TypesHamburgers.add(new ChikenHamburger("Chicken"));
	     TypesHamburgers.add(new VegetarianHamburger("Vegetarian"));
	     TypesHamburgers.add(new WesternHamburger("Western"));

		
		for (HamburgerTruck op : TypesHamburgers) {
			System.out.println(op);
			System.out.println(op.prepare());
			
		
		}//for each que itera el arreglo 
		
	}//Main

}//class Principal
