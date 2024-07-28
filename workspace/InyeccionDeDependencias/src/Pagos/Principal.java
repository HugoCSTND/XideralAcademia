package Pagos;

public class Principal {

	public static void main(String[] args) {
		
		Repartidor repartidor = new Repartidor ("¡Buenos dias, soy Bob!");
		
		Inyector.inyectar(repartidor);
		
		repartidor.entregarPaquete();

	}//Main

}//ClassPrincipal
