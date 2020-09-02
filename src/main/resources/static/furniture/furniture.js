angular.module('app').controller('furnitureController', function ($scope, $http) {
    const contextPath = 'http://localhost:8189/app';

    fillTable = function () {
        $http.get(contextPath + '/api/v1/furniture')
            .then(function (response) {
                $scope.FurnitureList = response.data;
            });
    };

    fillTable();
});