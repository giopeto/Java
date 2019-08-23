/**
 * UserCtrl Controller
 *
 */
angular.module('ws').controller('UsersCtrl', function($scope, $q, $resource) {
    
    function init() {
    	$scope.currentUser = {};
    	$scope.currentUser.username = "todor";
    	
    	loadAllUsers().then(
    			function(allUsers) {
		    		$scope.users = allUsers;
		    		console.log(["Users resolved: ", $scope.users]);
		    	},
		    	function(reason) {
		    		console.error(["Error loading users, reason:	", reason]);
		    	});
    	
    	console.log("controller inited");
    }

    // Load users
    function loadAllUsers() {
    	var resource = $resource('service/users');
    	return resource.query().$promise;
    }

    init();
});