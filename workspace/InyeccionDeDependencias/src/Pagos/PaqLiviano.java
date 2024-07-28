package Pagos;

public class PaqLiviano implements Typeof{
	
	private String tipoPaquete;

	public PaqLiviano(String tipoPaquete) {
		this.tipoPaquete = tipoPaquete;
		
	}//constructor
	
    @Override
	public void entregarPaquete() {
		System.out.println("Tu entrega es un "+ tipoPaquete);
		
	}//Metodo
	
}//ClasssTransferencia
