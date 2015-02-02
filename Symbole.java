package lab01;

public class Symbole{
	public int frequence = 0;
	public int value = 0;
	
	public Symbole(int f, int v) {
		frequence = f;
		value = v;
	}
	public Symbole () {
		
	}
	
	public int ajouterFrequence() {
		return frequence += 1;
	}
	
	public int compare(Symbole unSymbole) {
		
		int resultat = 0;
		
		if(this.frequence > unSymbole.frequence)
			resultat = 1;
		if(this.frequence < unSymbole.frequence)
			resultat = -1;
		if(this.frequence == unSymbole.frequence)
			resultat = 0;
		
		return resultat;
	}
	
	public int getFrequence() {
		return frequence;
	}
	public void setFrequence(int f) {
		frequence = f;
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int v){
		value = v;
	}

}
