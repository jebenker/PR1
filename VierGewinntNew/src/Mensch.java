public class Mensch extends Spieler {

	@Override
	public void setName() {
	}

	@Override
	public String getName() {
		return null;
	}
	
	// constructor
	// instance of Mensch
	public Mensch(String name, char stein) {
	super.name = name;
	super.stein = stein;
	}
	

}