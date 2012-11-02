<script type="text/javascript" src="/gc/js/variosValidadores.js"></script>
<%@ attribute name="id" required="true" %>

<input type="text" id="${id}" name="${id}" onblur="validaData(this)" required="required" maxlength="10" onKeyUp="formataData(this);formatar(this, '##/##/####');"/>
<script type="text/javascript">
jQuery(document).ready(function(){

$.datepicker.setDefaults({dateFormat: 'dd/mm/yy',
    dayNames: ['Domingo','Segunda','Terça','Quarta','Quinta','Sexta','Sábado','Domingo'],
    dayNamesMin: ['D','S','T','Q','Q','S','S','D'],
    dayNamesShort: ['Dom','Seg','Ter','Qua','Qui','Sex','Sáb','Dom'],
    monthNames: ['Janeiro','Fevereiro','Março','Abril','Maio','Junho','Julho','Agosto','Setembro', 'Outubro','Novembro','Dezembro'],
    monthNamesShort: ['Jan','Fev','Mar','Abr','Mai','Jun','Jul','Ago','Set', 'Out','Nov','Dez'],
    nextText: 'Próximo',
    prevText: 'Anterior'
   });

$("#${id}").datepicker({dateFormat: 'dd/mm/yy'});

});
</script>