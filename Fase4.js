
function funcionFase4() {
		var  nom = "Juan", cognom1 = " Perez", cognom2 = " de Asis",				
			 dia = 25, mes = 12, any = 1978,
			 nom_complet = nom + cognom1 + cognom2,
			 data_naixement = dia + "/" + mes + "/" + any,
						
			 any_traspas = ((any % 4 == 0 && any % 100 != 0) || (any % 100 == 0 && any % 400 == 0));
		
		document.write ("El meu nome es " + nom_complet);
		document.write("<br>");
		document.write ("Vaig neixer el " +  data_naixement);
		document.write("<br>");
						
		
		if (any_traspas) {
			document.write("El meu any de naixement(" + any + ") es de traspas.");  
		          
       	}
		else {
			document.write("El meu any de naixement(" + any + ") no es de traspas.");
		}
	 	setInterval("location.reload()",4000);
}
