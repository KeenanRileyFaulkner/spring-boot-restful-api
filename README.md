# spring-boot-restful-api
This repository demonstrates how to create a RESTful API using Spring MVC and Spring HATEOAS.

It provides HAL representations of entities retrieved from an H2 database to any local client (such as postman, cURL, or any built-out GUI).

It also demonstrates the concept of backwards capatability; originally the Employee entity had only a single name attribute, but was updated to have both a firstname and a lastname attribute without creating breaking changes for any client using the legacy version of the API.

Further, it not only utilizes Spring HATEOAS to wrap entities, but demonstrates the concept of Hypermedia As The Engine Of Application State in action by providing conditional links to the client that signal valid state changes.
