package Tiere;

import java.util.ArrayList;
import java.util.List;

/**
 * Ein Tierpaar beinhaltet maximal ein M‰nnchen und ein Weibchen der selben Tierart
 *
 * @param <T>
 */
public class TierPaar<T extends Tier>{
	
	public Tier weibchen;
	public Tier maennchen;
	private char weiblich = 'W';
	private char maennlich = 'M';
	
	public boolean addTier(T tier) {
		//pr¸ft ob es ein Weibchen ist und noch kein Weibchen im Tierpaar ist
		if(weibchen==null && tier.getGeschlecht()==weiblich) {
			weibchen=tier;
			return true;
		}
		//pr¸ft ob es ein M‰nnchen ist und noch kein M‰nnchen im Tierpaar ist
		if(maennchen==null && tier.getGeschlecht()==maennlich) {
			maennchen=tier;
			return true;
		}
		// Das Tier konnte nicht hunzugef¸gt werden, da es bereits ein Tier mit dem
		// Geschlecht im Tierpaar gibt
		return false;
	}

}
