'use strict';

angular.module('videogenApp')
    .factory('Register', function ($resource) {
        return $resource('api/register', {}, {
        });
    });


