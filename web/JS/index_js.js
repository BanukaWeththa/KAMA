(function($) {
    $(function() {

        $('.button-collapse').sideNav();

    });
})(jQuery);

$(document).ready(function() {
    $('.carousel').carousel();
});

$('.carousel.carousel-slider').carousel({fullWidth: true});

$('.carousel').carousel({
    padding: 200
});
autoplay();
function autoplay() {
    $('.carousel').carousel('next');
    setTimeout(autoplay, 5000);
}