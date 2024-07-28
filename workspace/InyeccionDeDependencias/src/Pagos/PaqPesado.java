package Pagos;

public class PaqPesado implements Typeof{

	private String tipoPaquete;

	public PaqPesado(String tipoPaquete) {
		this.tipoPaquete = tipoPaquete;
		
	}//constructor
	
	@Override
	public void entregarPaquete() {
		System.out.println("Tu entrega es "+ tipoPaquete);
		
	}//Metodo
	
}//ClassDeposito
