'use strict';

angular.module('videogenApp')
    .config(function ($stateProvider) {
        $stateProvider
            .state('flowplayer', {
                parent: 'site',
                url: '/videogen',
                data: {
                    authorities: []
                },
                views: {
                    'content@': {
                        templateUrl: 'scripts/app/flowplayer/flowplayer.html',
                        controller: 'FlowPlayerController'
                    }
                },
                resolve: {
                    
                }
            });
    });
