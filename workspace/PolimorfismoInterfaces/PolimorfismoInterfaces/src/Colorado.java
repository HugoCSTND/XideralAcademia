
public class Colorado implements Concessionaire {
	int price = 700_000;

	public Colorado(int price) {
		super();
		this.price = price;
	}//constructor

	@Override
	public int comprar() {
		return price;
	}//Override

	@Override
	public String toString() {
		return "Colorado [price=" + price + "]";
	}
	
}//ClassColorado
