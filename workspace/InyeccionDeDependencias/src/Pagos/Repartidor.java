package Pagos;

public class Repartidor {
	
	private String name; 
	Typeof Paquete;
	
	
	public Repartidor(String name) {
		this.name = name;
		
	}//Constructor
	
	void entregarPaquete() {
		System.out.println(name);
		Paquete.entregarPaquete();
		
	}//Metodo
	
}//ClassRepartidor
