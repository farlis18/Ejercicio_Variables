
function funcionFase3() {
		var any_inici = 1948,
			any_naixement = 1978,
		
			any_traspas = ((any_naixement % 4 == 0 && any_naixement % 100 != 0) || (any_naixement % 100 == 0 && any_naixement % 400 == 0)),
		
		 	es_any_traspas = "El meu any de naixement(" + any_naixement + ") es de traspas.",
			no_es_any_traspas =  "El meu any de naixement(" + any_naixement + ") no es de traspas.";
		
				
		for(var i= any_inici; i<= any_naixement; i+=4) {
		
			document.write(i);
			document.write("<br>");
		}
		
		
		if (any_traspas) {
			document.write(es_any_traspas);  
		          
       	}
		else {
			document.write(no_es_any_traspas);
		}
		setInterval("location.reload()",4000);
		
}
