
public class WesternHamburger extends HamburgerTruck{

	public WesternHamburger(String type) {
		super(type);
		}//FatherConstructor

	@Override
	String prepare() {
		return "Mi Hamburguesa fav de Carls Jr ajja";
	}//FatherMethod
	

}//classHamburgerTruck
