<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<html>
<head>
	<title>Manter Cliente</title>
	<script type="text/javascript" src="/gc/js/jquery.js"></script>
	<script type="text/javascript" src="/gc/js/jquery-ui.js"></script>
	<script type="text/javascript" src="/gc/js/jquery.validate.js"></script>
	<link  href="/gc/css/validation.css" rel="StyleSheet" type="text/css">	
</head>
<body>

<!--Validacao -->

<script type="text/javascript">
	$(document).ready( function() {
		$("#formCliente").validate({
			rules:{
				nome:{				
					required: true, minlength: 2
				}
			},
			messages:{
				nome:{
					required: "Digite o nome do cliente",
					minLength: "O o nome do cliente deve conter, no mínimo, 2 caracteres"					
				}
			}
	  	});
		$("#formContato").validate({
			rules:{
				nome:{				
					required: true, minlength: 2
				},
				email:{				
					required: true, email: true
				},
				telefone:{
					required: true, minlength: 8
				}
			},
			messages:{
				nome:{
					required: "Digite o nome do contato",
					minLength: "O nome do contato deve conter, no mínimo, 2 caracteres"
				},
				email:{
					required: "Digite o e-mail para o contato",
					email: "Digite um e-mail válido"
				},
				telefone:{
					required: "Digite o telefone do cliente",
					minLength: "O numero de telefone deve conter, no mínimo, 8 caracteres"					
				}
			}
	  	});
	});
</script>

<!--Fim Validacao -->

<!-- Adiciona Tabela de Contatos na Tela -->
	
	<script type="text/javascript">
		function adicionaContatos(){
			doct = document.getElementById('tabelaInclusaoContato');
			doct.style.visibibility = 'visible';
		}	
	</script>
	
<!--Fim Adiciona Tabela de Contatos na Tela -->

<script type="text/javascript">
var input_cont = 0;
 
function addInput()
{
  var input = document.createElement('input');
  input.setAttribute('type', 'text');
  input.setAttribute('name', 'new_input_'+input_cont);
  input.setAttribute('id', 'new_input_'+input_cont);
  input.setAttribute('value', '');
 
  var add_input_div = document.getElementById('add_input_div');
  add_input_div.appendChild(input);
 
  input_cont++;
}
 
</script>

<!--Adiciona na tabela da pagina  -->

<script type="text/javascript">
totals =0;
function adiciona(){
totals++;
tbl = document.getElementById("tabela");
var novaLinha = tbl.insertRow(-1);
var novaCelula;

if(totals%2==0) cl = "#F5E9EC";
else cl = "#FBF6F7";

/*Declarando as variaveis*/
		
var obj1=document.getElementById("obj1").value;
var obj2=document.getElementById("obj2").value;
var obj3=document.getElementById("obj3").value;
var obj4=document.getElementById("obj4").value;
var aa= 'a'+totals;
var bb= 'b'+totals;
var cc= 'c'+totals;
var dd= 'd'+totals;

/*Cria um input*/

var input = document.createElement('input');
input.setAttribute('type', 'text');
input.setAttribute('name', aa);
input.setAttribute('id', aa);
input.setAttribute('value', obj1);
input.style.borderWidth = '0';
input.style.backgroundColor = cl;
input.setAttribute('readonly','');


/*Fim Cria um input*/
 
novaCelula = novaLinha.insertCell(0);
novaCelula.align = "left";
novaCelula.style.backgroundColor = cl;
novaCelula.appendChild(input);


/*Cria um input*/

var input = document.createElement('input');
input.setAttribute('type', 'text');
input.setAttribute('name', bb);
input.setAttribute('id', bb);
input.setAttribute('value', obj2);
input.style.borderWidth = '0';
input.style.backgroundColor = cl;
input.setAttribute('readonly','');


/*Fim Cria um input*/
 
novaCelula = novaLinha.insertCell(1);
novaCelula.align = "left";
novaCelula.style.backgroundColor = cl;
novaCelula.appendChild(input);

/*Cria um input*/

var input = document.createElement('input');
input.setAttribute('type', 'text');
input.setAttribute('name', cc);
input.setAttribute('id', cc);
input.setAttribute('value', obj3);
input.style.borderWidth = '0';
input.style.backgroundColor = cl;
input.setAttribute('readonly','');
 

/*Fim Cria um input*/
 
novaCelula = novaLinha.insertCell(2);
novaCelula.align = "left";
novaCelula.style.backgroundColor = cl;
novaCelula.appendChild(input);

/*Cria um input*/

var input = document.createElement('input');
input.setAttribute('type', 'text');
input.setAttribute('name', dd);
input.setAttribute('id', dd);
input.setAttribute('value', obj4);
input.style.borderWidth = '0';
input.style.backgroundColor = cl;
input.setAttribute('readonly','');

/*Fim Cria um input*/
 
novaCelula = novaLinha.insertCell(3);
novaCelula.align = "left";
novaCelula.style.backgroundColor = cl;
novaCelula.appendChild(input);

/*Cria um input oculto*/

document.getElementById("contador").setAttribute("value", totals);
};

</script>

<!--Fim Adiciona na tabela da pagina  -->
		
	<div align="center">
		<h3>Manter Cliente</h3>
		<hr />
		<br/>
		<h4>Cadastro Basico</h4>
	</div>			
			
	<form id="formCliente" action="manterClient" method="post">
		<table border="0" align="center">	
			<tr>
				<td>Nome:</td>
				<td style="width: 300px"><input type="text" name="nome" /></td>   
			</tr>
			<tr>
				<td>Razão Social:</td>
				<td><input type="text" name="razaoSocial" /></td>
			</tr>
			<tr>
				<td>Nome Fantasia:</td>
		   		<td><input type="text" name="nomeFantasia" /></td>	
		   	</tr>
		   	<tr>
		   		<td>CNPJ:</td>
		        <td><input type="text" name="cnpj" /></td>    
			</tr>
			<tr>	            
		        <td>Porte:</td>
		        <td>
		         	<select name="porte">
		   		   			<option value="grande">Grande</option>
		   		   			<option value="medio">Medio</option>
		   		   			<option value="pequeno">Pequeno</option>	   		   		
		   		   	</select><br />
		   		</td>   		   		   		  
		   	</tr>
		   	<tr>
		   		<td>Homepage:</td>
		        <td><input type="text" name="homepage" /></td>
		    </tr>
		    <tr>
		    	<td>Status:</td>
		        <td>
		            <select name="status">
		   		   			<option value="true">Ativado</option>
		   		   			<option value="false">Desativado</option>
		   		   	</select>
		   		 </td>  		  
		   	</tr>	   		  	   		   		  
			<tr>
				<td>&nbsp;</td><td>&nbsp;</td>				
			</tr>
			<tr align="center">
				<td colspan="2" rowspan="1">
					<input type="submit">
				</td>
			</tr>
		</table>
		<table id="tabela" align="center">
			<tr>
				<th>Nome</th>
				<th>Telefone</th>
				<th>Email</th>
				<th>Ramal</th>		
			</tr>
		</table>
	<input type="hidden" name="contador" id="contador"/>
	</form>	
		<!--Fim Grid de Contatos  -->	
		
	
	<div id="tabelaInclusaoContato">	
		<h3 align="center">Contatos</h3>
	
		<form id="formContato" >	
			<table  border="0"  align="center">
				<tr>
					<td>Nome:</td>
					<td style="width: 300px"><input type="text" name="obj1" id="obj1"></td>	
				</tr>
				<tr>
					<td>Telefone:</td>
					<td><input type="text" name="obj2" id="obj2"></td>
				</tr>
			 	<tr>
			 		<td>Email:</td>
			 		<td><input type="text" name="obj3" id="obj3"><br /></td>
			 	</tr>
			    <tr>
			    	<td>Ramal:</td>
			    	<td><input type="text" name="obj4" id="obj4"></td>
			    </tr>		
			    <tr>
			    	<td>***</td>
			    	<td><input type="button" id="incluir" value="incluir" onclick="adiciona()"/></td>
			    </tr>	         		    			 
			</table> 		 					   
		</form>	
	</div>
			
	<br/><br/>
	<table>
	    <tr align="center">
	    	<td colspan="2">

				<input type="button" value="Adicionar Contatos" onclick="adicionaContatos()"/>	    	
				<input type="button" value="Salvar" />    	
		    </td>
	    </tr>
	</table>
		
	<br />

	<div align="center">
		<input type="button" value="Voltar" />
	</div>	

	<br /><br />
<hr />
</body>
</html>