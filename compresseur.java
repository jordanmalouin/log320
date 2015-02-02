package lab01;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class compresseur {
	
	/*Pour chaque charactere dans le fichier texte, nous allons soit creer un nouveau symbole 
	 * dans la liste ou updater la frequence du symbole s'il existe deja dans la liste. La liste
	 * Comprends des objets Symbole et chaque Symbole contient la value en int et la frequence.*/
	private static ArrayList<Symbole> remplirListe(int value, ArrayList<Symbole> liste){
		
		boolean symboleTrouver = false;
		int symboleTrouverIndex = 0;
		
		for(int i = 0; i < liste.size() && !symboleTrouver; i++) {
			Symbole leSymbole = new Symbole();
			leSymbole.setValue(liste.get(i).value);
			if(leSymbole.value == value){
				symboleTrouver = true;
				symboleTrouverIndex = i;
			}
		}
		
		if(symboleTrouver){
			liste.get(symboleTrouverIndex).ajouterFrequence();
			symboleTrouver = false;
		}else{
			Symbole unSymbole = new Symbole(1,value);
			liste.add(unSymbole);
		}
		return liste;
	}
	
	private static ArrayList<Noeud> genererArbre(ArrayList<Symbole> liste){
		ArrayList<Noeud> listNoeud = new ArrayList<Noeud>();
		byte valeur = (byte)3;
		
		for(int i = 0; i < liste.size();i++){
			
		}
		
		return listNoeud;
	}

	public static void main(String[] args) {
		String fichier = "/Users/jordanmalouin/Desktop/fichier.txt";
		ArrayList<Symbole> listSymbole = new ArrayList<Symbole>();
		ArrayList<Noeud> listNoeud = new ArrayList<Noeud>();
		
		try {
			
			InputStream ips = new FileInputStream(fichier);
			InputStreamReader ipsr = new InputStreamReader(ips);
			BufferedReader br = new BufferedReader(ipsr);
			
			int value = 0;
			
			while(( value = br.read()) != -1) {

				listSymbole = remplirListe(value,listSymbole);

			}
			br.close();
			
			//Trie la liste avec la classe custom.
			Collections.sort(listSymbole,new CustomComparator());
			
			
			
			for(Symbole s : listSymbole){
				System.out.println("value: " + s.value + ", frequence: " + s.frequence);
			}
			
			//Genere la liste des noeuds de l'arbre avec la frequence qu'il revient pour ensuite utiliser cette liste
			//faire le nouveau fichier compresser.
			listNoeud = genererArbre(listSymbole);
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
