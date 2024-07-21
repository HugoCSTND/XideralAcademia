
public class Cheyenne implements Concessionaire  {
	int price = 1_600_000;

	public Cheyenne(int price) {
		super();
		this.price = price;
	}//constructor

	@Override
	public int comprar() {
		return price;
	}//Override

	@Override
	public String toString() {
		return "Cheyenne [price=" + price + "]";
	}

}//ClassCheyenne
