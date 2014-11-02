function benefactorController($scope , $http , $route){

	$scope.benefactor = {} ;
	
	$scope.resultStat = "fail" ;
	
	$scope.addBenefactor = function(){
		$http.post('api/benefactor/add' , $scope.benefactor).success( function(data){
			alert(data) ;
			$scope.resultStat = data ;
		}) ;
	};
	
	$('#reset_button').click(function() {
        $route.reload();
    });
}

function benefactorManageControll($scope , $http , $route){
	
}