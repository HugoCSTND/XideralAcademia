
public class BeaconHamburger extends HamburgerTruck{

	public BeaconHamburger(String type) {
		super(type);
		}//FatherConstructor

	@Override
	String prepare() {
		return  "Hamburguesa con tocino y aros de cebolla";
	}//FatherMethod
	
	
}//classBeaconHamburger
