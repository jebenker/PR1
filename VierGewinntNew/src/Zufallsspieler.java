public class Zufallsspieler extends Spieler {
	
	@Override
	public void setName() {
	}

	@Override
	public String getName() {
		return null;
	}
	
	// instance of comp
	public Zufallsspieler (String name, char stein) {
		super.name = name; 
		super.stein = stein;
	}
	
}