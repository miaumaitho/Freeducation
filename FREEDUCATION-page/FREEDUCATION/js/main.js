$(document).ready(function(){
    var altura = $('.barra').offset().top;
    $(window).on('scroll', function(){
		if ( $(window).scrollTop() > altura){
			$('.barra').addClass('barra-sticky');
		} else {
			$('.barra').removeClass('barra-sticky');
		}

	});

	$(window).on("load",function(){
		$('#page-loader').fadeOut(500);
	});

	

});