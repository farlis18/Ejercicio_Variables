public class Fase3 {

	public static void main(String[] args) {
		
		int any_inici = 1948;
		int any_naixement = 1978;
		
		boolean any_traspas = false;
		
		String es_any_traspas = "El meu any de naixement és de traspàs.";
		String no_es_any_traspas =  "El meu any de naixement no és de traspàs.";
		
				
		for(int i= any_inici; i<= any_naixement; i+=4) {
		
			System.out.println(i);
		}
		
		if ((any_naixement % 4 == 0 && any_naixement % 100 != 0) || (any_naixement % 100 == 0 && any_naixement % 400 == 0)) {
           
			any_traspas = true;
		}
		
		if (any_traspas) {
			System.out.println (es_any_traspas);  
		          
       	}
		else {
			System.out.println(no_es_any_traspas);
		}
		
	}

}
