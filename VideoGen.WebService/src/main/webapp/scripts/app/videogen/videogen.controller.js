'use strict';

angular.module('videogenApp', ["ngSanitize"])
    .controller('VideoGenController',
    	["$sce", function ($sce) {
			this.config = {
				sources: [
				          {src: $sce.trustAsResourceUrl("http://localhost:8080/static/playlist.m3u8"), type: "application/x-mpegURL"}
				],
				theme: "bower_components/videogular-themes-default/videogular.css",
			};
		}]
    });
