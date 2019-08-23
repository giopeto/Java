/**
 * UserDetailCtrl Controller
 *
 */
angular.module('ws').controller('UserDetailCtrl', ['$scope', '$state', '$stateParams', 'Resource', 'UserSrv', 
                                                   function($scope, $state, $stateParams, $resource, UserSrv) {
    
	// Returns a promise of the selected user.
    function getUser(userId) {
    	return UserSrv.get({"userId": userId}).$promise;
    }
    
    function init() {
        // Get the user
    	console.log(["$stateParams.userId:	", $stateParams.userId]);
    	$scope.user = {};
    	if($stateParams.userId) {
    		 getUser($stateParams.userId).then(
	        		function(loadedUser) {
			        	setUserScope(loadedUser);
			        },
			        function(reason) {
			        	console.log(["Error updating user with name:", $stateParams.username]);
			        });
    	}     
    }
    
    function setUserScope(user) {
    	$scope.user = user;
    	console.log(["$scope.user:	", $scope.user]);
//    	$scope.user.id = user.id;
    }

    $scope.save = function(user) {
    	return ($scope.user.id != undefined) ? update(user) : create(user);
    };
    
    function update(userFormData) {
    	
//    	console.log(["userFormData:	", userFormData]);
//        $scope.user.id = $stateParams.userId;        
//    	$scope.user.id = $scope.user.id;
    	
        console.log(["Updating user:	", $scope.user]);
//        var user = new UserSrv({
//        	id: $scope.user.id,
//        	username: $scope.user.username,
//        	email: $scope.user.email
//        });
//        var user = new UserSrv();
//        _.extend(user, $scope.user);
//        var userId = $scope.user.id + '';
        
//        user.$save({'userId': userId},
//        $scope.user.$save(
    	/*$scope.user.$save({'userId': $scope.user.id},
            function(data, headers) {
//    		function() {
            	console.log(['Success, data:	', data]);
                $state.go($state.current, { }, { reload: true });
            },
            function(response) {
            	console.log(["Error updating user:", response]);
            }
        );*/
        
        
        $scope.user.$save({'userId': $scope.user.id});
        
        
    };
    
//    function update(userFormData) {
//      console.log(["Updating user:	", $scope.user]);
//      var user = new UserSrv($scope.user);
////      var user = new UserSrv();
////      _.extend(user, $scope.user);
//      
//      UserSrv.$save({"userId": $scope.user.id},
////      $scope.user.$save(
////          function(data, headers) {
//  		function() {
////          	console.log(['Success, data:	', data]);
//              $state.go($state.current, { }, { reload: true });
//          },
//          function(response) {
//          	console.log(["Error updating user:", response]);
//          }
//      );
//  };
    
    function create(userFormData) {
        console.log(["Creating user	:	", $scope.user]);
//        $scope.user.id = _.noop();
//        var user = $scope.user;
//        _.extend(user, userFormData);
        
//        $scope.user.$save(
//        user.$save(
//            function(data, headers) {
//            	console.log(["Success, data:	", data]);
//                $state.go($state.current, { }, { reload: true });
//            },
//            function(response) {
//            	console.log(["Error creating user:	", response]);
//            }
//        );
        
        $scope.user.password = $scope.user.username;
        var user = new UserSrv($scope.user);
        console.log(["Creating user	resource:	", user]);
        
        user.$save();
    };

    $scope.reload = function() {
        $scope.user.id = $stateParams.userId;
        $state.go($state.current, { username: $scope.user.userId}, { reload: true });
    };


    init();
}]);