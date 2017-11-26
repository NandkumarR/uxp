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

