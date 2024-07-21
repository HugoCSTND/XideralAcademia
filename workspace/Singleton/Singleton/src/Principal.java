
public class Principal {
	public static void main(String[] args) {
		// Obtener la única instancia de TacoCart
		TacoCart cart1 = TacoCart.getInstance();
		TacoCart cart2 = TacoCart.getInstance();
		TacoCart cart3 = TacoCart.getInstance();
		TacoCart cart4 = TacoCart.getInstance();

		// Agregar tacos al carrito
		cart1.addTaco("Taquito de pastor");
		cart2.addTaco("Taquito de arrachera");
		cart3.addTaco("Taquito de tripa");
		cart4.addTaco("Taquito de suadero");

		// Mostrar el contenido del carrito
		cart1.showCart();
		
        System.out.println("Número de instancias creadas: " + TacoCart.contador);

	}//Metodo Main
	
	
}//class Principal