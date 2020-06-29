
public class Fase2 {

	public static void main(String[] args) {
		
		final int any_inici = 1948;
		int data_naixement = 1978;
		int cant_traspas=0;
		
		for(int i= any_inici; i<= data_naixement; i+=4) {
		
			cant_traspas+=1;
		}
		System.out.println("Des de " + any_inici + " fins al " +  data_naixement + " hi ha " + cant_traspas + " anys de traspas.");
		
	}

}
