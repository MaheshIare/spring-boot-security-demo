# spring-boot-security-demo

This is a simple spring application developed using Spring boot to demonstrate the Spring security role based Authentication with database integration. 

## Tech stack

```java
	Spring boot
	Spring security
	H2 in-memory database
```

## Build

```bash
mvn clean install
```

## Description
I have implemented the spring security role based authentication using username and roles for the Rest API's integrated with database maintaining the roles of the users. You will not be able to access the Rest API's unless you have the specified role. For simplicity, i have used basic roles as below 

```java
username: user
password: <bcrypted-password>
role: ROLE_USER

username: admin
password: <bcrypted-password>
role: ROLE_ADMIN

username: operator
password: <bcrypted-password>
role: ROLE_OPERATOR

### All the encoded passwords for the above users are saved and updated into the h2 database on application startup using Spring provided BcryptPasswordEncoder class ###
```

## More Information
This application consists of different set of Rest API's with specific User roles authentication. For e.g

```bash
GET : http://localhost:8080/spring-boot-security-demo/api/v1/vehicle
Role allowed: USER, ADMIN, OPERATOR

GET : http://localhost:8080/spring-boot-security-demo/api/v1/vehicle/1
Role allowed: USER, ADMIN, OPERATOR

POST : http://localhost:8080/spring-boot-security-demo/api/v1/vehicle
Role allowed: USER, ADMIN

PUT : http://localhost:8080/spring-boot-security-demo/api/v1/vehicle
Role allowed: USER, ADMIN

DELETE : http://localhost:8080/spring-boot-security-demo/api/v1/vehicle
Role allowed: ADMIN

```

## Instructions
For accessing any API as specified above, you need to pass the Authorization header with specific user credentials


## Contributing
Thanks much. Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.
Please make sure to update tests as appropriate.
