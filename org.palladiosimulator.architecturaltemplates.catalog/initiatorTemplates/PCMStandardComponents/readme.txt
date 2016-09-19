Palladio Software Architecture Simulator, http://www.palladio-simulator.com

This folder holds a repository with a set of standard reusable software components and interfaces. These components and interfaces can be used across multiple projects to ease starting modeling.

All time units refer to milliseconds (ms).


Components:
- Cache
- StandardForwardingComponent: forwards request to the next component without affecting performance, control or data flow
- Loadbalancer (2x)

Interfaces:
- IRequest: standard request interface 


TODO:
- Loadbalancer (3x, 4x balancing)
- ConnectionPool
- Webserver
- Database

Infrastructure Components:
- Application Server
- Webserver
- DNS Server
	- self-contained
	- compositional with multiple hops on lookup miss

Interfaces:
- IDb: standard database interface


TODO:
- Forward all parameter characterisations
- always handle return values