'use strict';

angular.module('videogenApp')
    .config(function ($stateProvider) {
        $stateProvider
            .state('videogen', {
                parent: 'site',
                url: '/videogen',
                data: {
                    authorities: []
                },
                views: {
                    'content@': {
                        templateUrl: 'scripts/app/videogen/videogen.html',
                        controller: 'VideoGenController'
                    }
                },
                resolve: {
                    
                }
            });
    });
