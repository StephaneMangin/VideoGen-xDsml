/* globals $ */
'use strict';

angular.module('videogenApp')
    .directive('videogenAppPagination', function() {
        return {
            templateUrl: 'scripts/components/form/pagination.html'
        };
    });
