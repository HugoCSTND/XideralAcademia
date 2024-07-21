
public class ChikenHamburger extends HamburgerTruck{

	public ChikenHamburger(String type) {
		super(type);
		}//FatherConstructor

	@Override
	String prepare() {
		return "Hamburguesa de pollito con queso gratinado";
	}//FatherMethod
	

}//class ChikenHamburger
