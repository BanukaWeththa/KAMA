$(function() {

//  $.validator.setDefaults({
//    errorClass: 'help-block',
//    highlight: function(element) {
//      $(element)
//        .closest('.form-group')
//        .addClass('has-error');
//    },
//    unhighlight: function(element) {
//      $(element)
//        .closest('.form-group')
//        .removeClass('has-error');
//    },
//    errorPlacement: function (error, element) {
//      if (element.prop('type') === 'checkbox') {
//        error.insertAfter(element.parent());
//      } else {
//        error.insertAfter(element);
//      }
//    }
//  });

    $.validator.addMethod('strongPassword', function(value, element) {
        return this.optional(element)
                || value.length >= 8
                && /\d/.test(value)
                && /[a-z]/i.test(value);
    }, 'Your password must be at least 8 characters long and contain at least one number and one char\'.');


    $("#registerform").validate({
        errorClass: "my-error-class",
        validClass: "my-valid-class",
        rules: {
            email: {
                required: true,
                email: true,
                remote: {
                    url: "http://localhost:8080/AJDS_Project/checkajax",
                    type: "post"
                }
            },
            password: {
                required: true,
                strongPassword: true
            },
            repassword: {
                required: true,
                equalTo: '#password'
            },
            firstName: {
                required: true,
                nowhitespace: true,
                lettersonly: true
            },
            lastName: {
                required: true,
                nowhitespace: true,
                lettersonly: true
            },
            phone: {
                required: true,
                digits: true
                        //phonesUK: true
            }
//      terms: {
//        required: true
//      }
        },
        messages: {
            email: {
                required: 'Please enter an email address.',
                email: 'Please enter a <em>valid</em> email address.',
                repassword: 'Please re-enter the password',
                remote: "Email already in use!"

            }
        }
    });

});