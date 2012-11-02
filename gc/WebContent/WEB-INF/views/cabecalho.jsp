<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<html>
<head>
<title>Insert title here</title>
<style type="text/css">
ul
{
list-style-type:none;
margin:0;
padding:0;
overflow:hidden;
}
li
{

}
a:link,a:visited
{
display:block;
font-weight:bold;
color:#FFFFFF;
background-color:#98bf21;
text-align:center;
padding:4px;
text-decoration:none;
text-transform:uppercase;
}
a:hover,a:active
{
background-color:#7A991A;
}

</style>

</head>
<body>
	<div align="center">       
    <c:url value="/imagens/logo.PNG" var="imagem"/>
    <div align="right">
    	<img src="${imagem}" />
    </div>
    <div align="center">
			<table align="center" width="600" height="50">
				<tr>				
					<td nowrap>
						<a href="formCliente">Cliente</a>						
					</td>
				    <td nowrap>
						<a href="formProjeto">Projeto</a>						
					</td>								
					<td nowrap>
						<a href="formCronograma">Cronograma</a>						
					</td>
					<td nowrap>
						<a href="formFuncionario">Funcionario</a>						
					</td>
				</tr>
				<tr>
					<td nowrap>
						<a href="listaClientes">Lista Clientes</a>						
					</td>	
				    <td nowrap>
						<a href="listaFuncionarios">Lista Funcionarios</a>						
					</td>
				    <td nowrap>
						<a href="listaProjetos">Lista Projetos</a>						
					</td>
					<td nowrap>
						<a href="mostraCronogramaFuncionario">Cron. Func.</a>						
					</td>
				</tr>
				<tr>
					<td nowrap>
						<a href="cronograma">Manter Cronograma</a>						
					</td>					
					<td nowrap>
						<a href="cronogramaFuncionario">Manter Cronograma Funcionario</a>						
					</td>
					<td nowrap>
						<a href="projeto">Manter Projeto</a>						
					</td>
					<td nowrap>
						<a href="horas">Apontar Horas</a>						
					</td>
			
				</tr>				
			</table>
	</div>
	<br />
	</div>
</body>
</html>