import java.util.ArrayList;

public class Principal {
 public static void main(String[] args) {
		ArrayList<Concessionaire> TypesTrucks = new ArrayList<>();
		 
		TypesTrucks.add(new Colorado(700_000));
		TypesTrucks.add(new Tahoe(1_100_000));
		TypesTrucks.add(new Cheyenne(1_600_000));
		TypesTrucks.add(new Silverado(1_200_000));

		
		for ( Concessionaire op : TypesTrucks) {
			System.out.println(op);
			
			
		
		}//for each que itera el arreglo 
	
   }//main
 
}//ClassPrincipal
