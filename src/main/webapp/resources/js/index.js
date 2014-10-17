var pebms_app = angular.module('pebms', ['ngRoute']);

pebms_app.config(['$routeProvider', function ($routeProvider) {
    $routeProvider
        .when('/farmer', { templateUrl: 'resources/pages/farmer.html', controller: FarmerController})
        .otherwise({redirectTo: '/home'});
}]);

var transform = function(data){
    return $.param(data);
};

var config = {
    headers: { 'Content-Type': 'application/x-www-form-urlencoded; charset=UTF-8'},
    transformRequest: transform
};
