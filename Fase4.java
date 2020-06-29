
public class Fase4 {

	public static void main(String[] args) {
		
		String nom, cognom1, cognom2, nom_complet;
		nom="Juan";
		cognom1=" Perez";
		cognom2=" de Asis";
		nom_complet = nom + cognom1 + cognom2;
		
		
		String dia, mes, any, data_naixement;
		dia="25";
		mes="12";
		any="1978";
		data_naixement = dia + "/" + mes + "/" + any;
		
		int any_naixement = Integer.parseInt(any); 
		
		boolean any_traspas = false;
		
		if ((any_naixement % 4 == 0 && any_naixement % 100 != 0) || (any_naixement % 100 == 0 && any_naixement % 400 == 0)) {
	           
			any_traspas = true;
		}
	
		System.out.println ("El meu nome es " + nom_complet);
		System.out.println ("Vaig néixer el " +  data_naixement);
				
		
		if (any_traspas) {
			System.out.println ("El meu any de naixement és de traspàs.");  
		          
       	}
		else {
			System.out.println("El meu any de naixement no és de traspàs.");
		}
		
	}

}
