package lab01;

public class Noeud {
	
	byte valeur;
	int frequence;
	
	public Noeud() {
		valeur = 0;
		frequence = 0;
	}
	
	public Noeud(byte b, int f){
		valeur = b;
		frequence = f;
	}

	public int getFrequence(){
		return frequence;
	}
	
	public void setFrequence(int f){
		frequence = f;
	}
	
	public byte getValeur(){
		return valeur;
	}
	
	public void setValeur(byte b){
		valeur = b;
	}
}
