angular.module('app').controller('documentController', function ($scope, $http) {
    const contextPath = 'http://localhost:8189/app';

    fillTable = function () {
        $http.get(contextPath + '/api/v1/document')
            .then(function (response) {
                $scope.DocumentList = response.data;
            });
    };

    fillTable();
});