<script type="text/javascript" src="/gc/js/variosValidadores.js"></script>
<%@ attribute name="id" required="true" %>

<input type="text" id="${id}" name="${id}" onblur="validaData(this)" required="required" maxlength="10" onKeyUp="formataData(this);formatar(this, '##/##/####');"/>
<script type="text/javascript">
jQuery(document).ready(function(){

$.datepicker.setDefaults({dateFormat: 'dd/mm/yy',
    dayNames: ['Domingo','Segunda','Ter�a','Quarta','Quinta','Sexta','S�bado','Domingo'],
    dayNamesMin: ['D','S','T','Q','Q','S','S','D'],
    dayNamesShort: ['Dom','Seg','Ter','Qua','Qui','Sex','S�b','Dom'],
    monthNames: ['Janeiro','Fevereiro','Mar�o','Abril','Maio','Junho','Julho','Agosto','Setembro', 'Outubro','Novembro','Dezembro'],
    monthNamesShort: ['Jan','Fev','Mar','Abr','Mai','Jun','Jul','Ago','Set', 'Out','Nov','Dez'],
    nextText: 'Pr�ximo',
    prevText: 'Anterior'
   });

$("#${id}").datepicker({dateFormat: 'dd/mm/yy'});

});
</script>