# Web application for selling apartments 
### Own implementation of real world apps

## Assumptions
### The assumptions were to create a web application that would allow:
1. [Account registrations](#registration-form)
   * Full validation
   * Password hashing (`BCrypt`)
2. [Login](#login-page)
3. [Viewing offers](#main-page)
4. [Adding offers](#after-logging-in)
5. [Deleting offers](#after-logging-in)
5. [Filtering offers](#filtered-offer)
6. [Details of offers](#details-of-offer)
7. [Sending e-mails after registration](#)

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

### Main page
#### sample offers are added here. Constants in the database. There is also filtering by province.
<p align="left"> 
  <img src="https://i.imgur.com/6xxtTm0.png"  width="700px">
</p>

### Login page 
#### from which we can log in or go to the registration form.
<p align="left"> 
  <img src="https://i.imgur.com/24iL1Wh.png"  width="700px">
</p>

### Registration form
<p align="left"> 
  <img src="https://i.imgur.com/7ZOiIC8.png"  width="700px">
</p>

### After logging in
#### you can add/delete your own offers.
<p align="left"> 
  <img src="https://i.imgur.com/ZAnbKJk.png"  width="700px">
</p>

### Filtered offer
<p align="left"> 
  <img src="https://i.imgur.com/OaSukpe.png"  width="700px">
</p>

### Details of offer
<p align="left"> 
  <img src="https://i.imgur.com/9x8diod.png"  width="700px">
</p>

## Status of project: ``` + COMPLETE ```
