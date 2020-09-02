(function () {
    'use strict';

    angular
        .module('app', ['ngRoute'])
        .config(config)
        .run();

    function config($routeProvider) {
        $routeProvider
            .when('/products', {
                templateUrl: 'product/products.html',
                controller: 'productsController'
            })
            .when('/furniture', {
                templateUrl: 'furniture/furniture.html',
                controller: 'furnitureController'
            });
    }
})();