angular.module('ws')
    .config(['$stateProvider', '$urlRouterProvider', function($stateProvider, $urlRouterProvider) {

        // USERS
        var user = {		// Parent state
            name: 'user',
            url: '/user',
            templateUrl: 'partials/user/dashboard.html',
            controller: 'UserDashboardCtrl'
        };
        var usersList = {		// Child state
            name: 'user.list',
            url: "/list",
            parent: user,
            templateUrl: 'partials/user/list.html',
            controller: 'UsersCtrl'
        };
        var userDetails = {		// Child state
            name: 'user.details',
            url: '/details/:userId',
            parent: user,
            templateUrl: 'partials/user/details.html',
            controller: 'UserDetailCtrl'
        };
        var userCreate = {		// Child state
            name: 'user.create',
            url: '/details',
            parent: user,
            templateUrl: 'partials/user/details.html',
            controller: 'UserDetailCtrl'
        };
        
        $stateProvider.state(user);
        $stateProvider.state(usersList);
        $stateProvider.state(userDetails);
        $stateProvider.state(userCreate);
        
        $urlRouterProvider.otherwise('/user/list');
    }]
);