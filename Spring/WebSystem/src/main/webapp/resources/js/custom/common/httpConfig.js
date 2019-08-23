/* wsResource Module */
angular.module('wsResource', ['ngResource'])
    .factory('Resource', [ '$resource', function($resource) {
        // override resource to use puts instead of posts for existing objects on save
        return function(url, params, methods) {
            var defaults = {
                update: { method: 'put', isArray: false },
                create: { method: 'post' }
            };

            methods = angular.extend(defaults, methods);

            var resource = $resource(url, params, methods);

            resource.prototype.$save = function(params, success, error) {
            	//
            	// if id is just a number, converts it to the string
            	var idAsString = _.isNumber(this.id) ? '' + this.id : this.id;

                if (_.isEmpty(idAsString)) {
                    return this.$create(params, success, error);
                } else {
                    return this.$update(params, success, error);
                }
            };

            return resource;
        };
    }]);


