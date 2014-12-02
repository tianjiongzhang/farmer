var pebms_app = angular.module('pebms', ['ngRoute']);

pebms_app.config(['$routeProvider', function ($routeProvider) {
    $routeProvider
        //.when('/benefactor/:editType/:id', { templateUrl: 'resources/pages/benefactor.html', controller: benefactorController})
        //.when('/benefactor_list', { templateUrl: 'resources/pages/benefactor_list.html', controller: benefactorListController})
        .otherwise({redirectTo: '/home'});
}]);

var transform = function (data) {
    return $.param(data);
};

var config = {
    headers: { 'Content-Type': 'application/x-www-form-urlencoded; charset=UTF-8'},
    transformRequest: transform
};


function benefactorController($scope , $http , $route , $routeParams){

	$scope.benefactor = {} ;
	
	$scope.editType = $routeParams.editType ;
	$scope.id = $routeParams.id ;
	
	
	$scope.resultStat = "fail" ;
	
	$scope.addBenefactor = function(){
		if($scope.editType == 'editNew'){
			$http.post('service/benefactor/add' , $scope.benefactor).success( function(data){
				$scope.resultStat = data ;
			}) ;
		}else if($scope.editType == 'editModify'){
			$http.post('service/benefactor/modify' , $scope.benefactor).success( function(data){
				$scope.resultStat = data ;
			}) ;
		}
	};
	
	var init = function () {
		if($scope.editType != 'editNew'){
			$http.post('service/benefactor/seachById' , $scope.id).success( function(data){
				$scope.benefactor = data ;
			}) ;
		}
	} ;
	
	init();
	
	$('#reset_button').click(function() {
        $route.reload();
    });
	
}

function benefactorListController($scope , $http , $route){

	$scope.deleteBenefactor = function(id){
		var queryParam = {"id" :id} ;
		$http.post('service/benefactor/delete' , queryParam , config).success(function(data){
			if(data == "success"){
				init() ;
			}else {
				alert("无法删除该捐助者") ;
			}
			
		}) ;
	} ;
	
	var queryData = {"pageNo" : $("#pageNo").val() || ""} ;
	
	var init = function () {
		$http.post('service/benefactor/seachAll' , queryData , config).success( function(data){
			$scope.pageResult = data ;
		}) ;
	} ;
	
	init();
}

