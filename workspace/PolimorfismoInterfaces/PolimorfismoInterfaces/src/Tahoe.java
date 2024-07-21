
public class Tahoe implements Concessionaire {
	int price = 1_100_000;

	public Tahoe(int price) {
		super();
		this.price = price;
	}//constructor

	@Override
	public int comprar() {
		return price;
	}//Override

	@Override
	public String toString() {
		return "Tahoe [price=" + price + "]";
	}
	
}//ClassTahoe
