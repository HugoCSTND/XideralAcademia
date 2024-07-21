
public class VegetarianHamburger extends HamburgerTruck {

	public VegetarianHamburger(String type) {
		super(type);
		}//FatherConstructor

	@Override
	String prepare() {
		 return "Hamburguesas de falafel como las que vendian en CU";
	}//FatherMethod


}//classVegetarianHamburger
