html: JAX-RS Services Documentation 
=======================================================
Author: Jay Balunas, Marius Bogoevici

This example supports various RESTFul end points which also includes JSONP support for cross domain requests.

By default the base URL for services is `/html/rest`.

MemberService End Points
------------------------


* Request type: GET
* Return type: JSON
* Response example:

```javascript
[{"id":1,"name":"Jane Smith","email":"jane.smith@mailinator.com","phoneNumber":"2125551212"},{"id":0,"name":"John Smith","email":"john.smith@mailinator.com","phoneNumber":"2125551212"}]
```



* Request type: POST
* Request type: JSON
* Return type: JSON
* Request example:

```JavaScript
[{"name":"Jane Smith","email":"jane.smith@mailinator.com","phoneNumber":"4160000000"}]

* Response example:
 * Success: 200 OK
 * Validation error: Collection of `<field name>:<error msg>` for each error

```JavaScript
{"phoneNumber":"10-12 Numbers","email":"Invalid format"}
```

* Request type: GET
* Return type: JSON
* Response example:

```javascript
{"id":0,"name":"John Smith","email":"john.smith@mailinator.com","phoneNumber":"2125551212"}
```
