/**
 * UserDashboardCtrl Controller
 *
 */
angular.module('ws').controller('UserDashboardCtrl', function($scope, $state) {
	
    function init() {
    	$scope.user = {};
    	$scope.user.username = "To6ko";
    }

    init();

 });