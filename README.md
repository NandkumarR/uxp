# uxp
Assignment for UXP Systems
1.User have access to Add/Update/Fetch and Delete a user information.
2. Multiple users access are defined in the UXPSecureAssignment class based on the url. Only admin users have access to delete ,
specified users have access to rest and all readonly user have access to fetch service.
3. Insert/Update/Delete opearation return a view on success
4. Database used in HSQLDB
5. User Passowrk encryption is not handled as its out of scope
6. All the request param validation are kept out of scope
7. Embeded hsqldb 2.3 is overridden with 2.2.9 since there were some issues with the same.
8. com.uxpsystems.assignment.UXApplication - is the spring boot start up application
9. com.uxpsystems.assignment.Controller AssignmentController - is the controller class for any request /assignment 
10. com.uxpsystems.assignment.dao UserRequestDAOManager - is the dao class for accessing data layer.
11. com.uxpsystems.assignment.entity UserEntity - is the entiry class mapped to the User table.
12. com.uxpsystems.assignment.security UxpSecureAssignment -is the class implementing the authorization check for any request.
13. com.uxpsystems.assignment.service UserEntityService - is the interface defining the behaviour service implementation
14. com.uxpsystems.assignment.service UserEntityServiceImpl - is the implementation of the Service interface UserEntityService
15. src/main/resources/template/Success.html - called when Add/Update/Delete is completed succeffully.
16. src/main/resources/application.properies - define the application properties.
17. src.test.java - has the junits implementation for testing get service call.
18. pom.xml - defines all the dependencies required.
