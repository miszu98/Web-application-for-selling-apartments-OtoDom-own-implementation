# Web application for selling apartments 
### Own implementation of real world apps

## Assumptions
### The assumptions were to create a web application that would allow:
1. Account registrations
   * Full validation
   * Password hashing (`BCrypt`)
2. Login 
3. Viewing offers
4. Adding offers
5. Deleting offers
5. Filtering offers
6. Sending e-mails after registration

## Technologies

* JAVA language
* Spring Boot 
  * Spring Security
* Database: H2
* Hibernate
  * Hibernate Validator
- Thymeleaf
- Mail sender
- Passay

## Launch
Before starting, configure the `application.properties` file for a specific e-mail from which the application will be able to send e-mails to users

```
spring.mail.host= 
spring.mail.port=
spring.mail.username=
spring.mail.password=
```

## Images 
![alt text](https://i.imgur.com/vAkaOY1.png) Main page, sample offers are added here. Constants in the database. There is also filtering by province
<p align="right"> 
  <img src="https://i.imgur.com/tYoQOi1.png">
</p>
