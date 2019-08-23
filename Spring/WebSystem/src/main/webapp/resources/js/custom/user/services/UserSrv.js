'use strict';
/**
 * UserSrv Service
 *
 */
// USERS
angular.module('ws')
    .factory('UserSrv', [ 'Resource', function($resource) {
        return $resource('service/users/:userId', {userId: '@userId'});
    }]);

