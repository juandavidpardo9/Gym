function getVarsUrl(){
				var url= location.search.replace("?", "");
				var arrUrl = url.split("&");
				var urlObj={};   
				for(var i=0; i<arrUrl.length; i++){
					var x= arrUrl[i].split("=");
					urlObj[x[0]]=x[1]
				}
				return urlObj;
			}
	var misVariablesGet = getVarsUrl();  
	
	
function validar(){

		
		var n1 = document.getElementsByName("Nombre")[0].value;
		var n2 = document.getElementsByName("Edad")[0].value;
		var n3 = document.getElementsByName("Peso")[0].value;
		var a1 = document.getElementsByName("Altura")[0].value;
		

		var expr = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;		

		if ((n1 == "") ||(n2 == "") ||(n3 == "") ||(a1 == "") ) {  //COMPRUEBA CAMPOS VACIOS
			alert("Llene los campos correctamente");
			return false;
		}

	}
function imprimir(){
	var misvariablesGet =getVarsUrl();
	for(var el in misVariablesGet){
		document.getElementById(el).value=misVariablesGet[el]
	}
	
}
	
