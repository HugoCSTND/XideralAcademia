
import java.util.ArrayList;
import java.util.List;

public class TacoCart {
	private List<String> tacoList;
	private static TacoCart tacocart;
	static int contador;

	private TacoCart() {
		tacoList = new ArrayList<>();
		contador++;
		}// Constructor privado 

	public static TacoCart getInstance() {
		if (tacocart == null) {
			tacocart = new TacoCart();
		}
		return tacocart;
	}// Método estatico para obtener solo un objeto

	public void addTaco(String taco) {
		tacoList.add(taco);
		System.out.println(taco + " añadido al carrito.");
	}// Método para agregar un taco al carrito

	
	public void showCart() {
		System.out.println("Carrito de Tacos: " + tacoList);
	}// Método para mostrar los tacos en el carrito
	
}//class TacoCart
