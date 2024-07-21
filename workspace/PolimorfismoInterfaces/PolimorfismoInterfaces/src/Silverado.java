
public class Silverado  implements Concessionaire {
	int price = 1_200_000;

	public Silverado(int price) {
		super();
		this.price = price;
	}//constructor

	@Override
	public int comprar() {
		return price;
	}//Override

	@Override
	public String toString() {
		return "Silverado [price=" + price + "]";
	}
	
	
	
}//ClassSilverado