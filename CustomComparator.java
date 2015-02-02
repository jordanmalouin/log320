package lab01;

import java.util.*;

public class CustomComparator implements Comparator<Symbole>{

	@Override
	public int compare(Symbole symbole1, Symbole symbole2) {
		int resultat = 0;
		
		if(symbole1.frequence > symbole2.frequence)
			resultat = -1;
		if(symbole1.frequence < symbole2.frequence)
			resultat = 1;
		if(symbole1.frequence == symbole2.frequence)
			resultat = 0;
		
		return resultat;
	}

}
