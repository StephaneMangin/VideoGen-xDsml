'use strict';

angular.module('videogenApp')
    .controller('LogoutController', function (Auth) {
        Auth.logout();
    });
