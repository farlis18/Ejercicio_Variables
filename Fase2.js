
function funcionFase2() {
		const ANY_INICIO = 1948;
		data_naixement = 1978;
		cant_traspas=0;
		
		for(var i= ANY_INICIO; i<= data_naixement; i+=4) {
		
			cant_traspas+=1;
		}
		alert ("Des de " + ANY_INICIO + " fins al " +  data_naixement + " hi ha " + cant_traspas + " anys de traspas.");
	
}
