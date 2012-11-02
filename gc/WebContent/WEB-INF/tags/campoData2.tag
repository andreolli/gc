<script type="text/javascript" src="/gc/js/variosValidadores.js"></script>
<%@ attribute name="id" required="true" %>
<%@ attribute name="value" required="true" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<input type="text" id="${id}" name="${id}" value="${value} onblur="validaData(this);" required="required" maxlength="10" onKeyUp="formataData(this);formatar(this, '##/##/####');""/>
<script type="text/javascript">
jQuery(document).ready(function(){
		
$.datepicker.setDefaults({
    dayNames: ['Domingo','Segunda','Terça','Quarta','Quinta','Sexta','Sábado','Domingo'],
    dayNamesMin: ['D','S','T','Q','Q','S','S','D'],
    dayNamesShort: ['Dom','Seg','Ter','Qua','Qui','Sex','Sáb','Dom'],
    monthNames: ['Janeiro','Fevereiro','Março','Abril','Maio','Junho','Julho','Agosto','Setembro', 'Outubro','Novembro','Dezembro'],
    monthNamesShort: ['Jan','Fev','Mar','Abr','Mai','Jun','Jul','Ago','Set', 'Out','Nov','Dez'],
    nextText: 'Próximo',
    prevText: 'Anterior'
   });

//formata a data
$("#${id}").datepicker({dateFormat: 'dd/mm/yy'});
dateObject = $("#${id}").val();   
alert(dateObject); 
//var dateString =  dateObject.getDate()  + '/' + (dateObject.getMonth() + 1) + '/' + dateObject.getFullYear(); 
obj1=document.getElementById("${id}"); 
obj1.setAttribute('value',dateObject.getDate()  + '/' + (dateObject.getMonth() + 1) + '/' + dateObject.getFullYear());   


/*
//formata a data
$("#${id}").datepicker({dateFormat: 'dd/mm/yy'});
var dateObject=$("#${id}").datepicker("getDate");  
alert(dateObject);
var dateString =  dateObject.getDate()  + '/' + (dateObject.getMonth() + 1) + '/' + dateObject.getFullYear(); 
var obj1=document.getElementById("${id}");
obj1.setAttribute('value',dateString);
*/

});
</script>
