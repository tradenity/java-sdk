## Changelog

Version 1.0.2
- Bug fix: ShippingMethod#findAllForOrder return Page

Version 1.0.1
- Feature: Add 'Sort' class to allow for search result sorting.
- Bug fix: add 'PageRequest' parameters to missing requests. 
- Task: upgrade dependencies to avoid security vulnerabilities.

Version 1.0.0
- Cover all the resources of Tradenity V1 API
- Changed to the new exchange format (json body)
- Complete rewrite of the infrastructure code


Version 0.8.1
- Improvement: Move ResourcePage class to resources package where it belongs, it is internal use class only.
- Improvement: Change all 'delete' methods to return void instead of boolean. It will throw exception in case of error.


Version 0.8.0

-  Initial release
