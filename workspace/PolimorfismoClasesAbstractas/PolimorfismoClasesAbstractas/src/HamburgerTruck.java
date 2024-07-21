public abstract class HamburgerTruck {
     String type; // 

    public HamburgerTruck(String type) {
        this.type = type;
    }// Constructor

    abstract String prepare(); // Method abstract

    @Override
    public String toString() {
        return "Hamburger type: " + type;
    }//override
}//class HamburgerTruck