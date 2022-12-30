# 	:film_projector: Cinema app

## :pencil: General overview
RESTful application developed utilized Hibernate, Spring frameworks and represents a cinema tickets service based on roles access using registration and authentication policy.

## :woman_technologist: Project overview and architecture
The application adopts a **Dependency Injection (DI)** and **Inversion of Control (IoC)** patterns to achieve a good design of layered architecture
and divides into three main categories: presentation, application, data. Each of the layers contains objects related to the particular concern it represents.

- The presentation layer (Controller). This layer provides the interaction between the user and the back-end resources and handles the input HTTP requests from the client side.
- The application layer (Service). A business logic layer drives the core functionalities of the application.
- The data access layer (DAO). This layer is responsible for interacting with databases to save the application data via HQL queries.

![3-tier](https://user-images.githubusercontent.com/96411307/195382480-50c2196d-3738-420b-8818-c6b9b08d923f.png)

The application implements a Data Transfer Object (DTO) Design Pattern which aggregates and encapsulates objects data for the transfer purpose. Models are mapped to DTOs and vice versa through a mapper component on the application layer.

## Feature set of the application
A customer can get access to the application through endpoints, which let ability monitor and interact with the application.
While a web service utilizes the standard HTTP, and arranges a set of the endpoints that cover the usual Create, Read, Update, and Delete (CRUD) operations.

#### :technologist: The application supports two type of roles:
- User
- Admin

Each role has restricted access to certain resources that can be accessed via the following endpoints:

#### Access level `ALL`
- register a new user `/register`, request `POST`.
- login to the app `/login`, request `POST`
#### Access level `ADMIN`
- get the user by email `/users/by-email`, request `GET`.
- add a new cinema hall `/cinema-halls`, request `POST`.
- add a new movie `/cinema-halls`, request `POST`.
- add a new movie session `/movie-sessions`, request `POST`.
- change the movie session `/movie-sessions/{id}`, request `PUT`.
- delete the movie session `/movie-sessions/{id}`, request `DELETE`.
#### Access level `ADMIN / USER`
- get a list of cinema halls `/cinema-halls`, request `GET`.
- get a list of movies `/movies`, request `GET`.
- get a list of movie sessions for a specified movie and date  
`/movie-sessions/available?movieId={?}&date={?}`, request `GET`.
#### Access level `USER`
- add the ticket to the shopping cart `shopping-carts/movie-sessions`, request `PUT`.
- get a list of tickets in the user's cart `/shopping-carts/by-user`, request `GET`.
- confirm the ticket order in the shopping cart `/orders/complete`, request `POST`.
- get a list of this user's orders `/orders-user`, request `GET`.

## :building_construction: Application technologies used

- Java 11
- Maven
- MySQL
- Tomcat
- Hibernate
- Spring Framework Core
- Spring MVC
- Spring Security

## :eyes: How to run this application?

- You need Apache Tomcat (version 9.0.50).
- You need local or external MySql DB.
- You need to change the configuration information in the file [`/resources/db.properties`](https://github.com/vyshnevsky/cinema-app/blob/main/src/main/resources/db.properties).
- Finally, you can start the application
- After running the application you will be redirected to login page. You can use:
    * username `admin@i.ua` with password `admin123` to login as admin,
    * username `user@i.ua` with password `user123` to login as user.
- You can use Postman to send requests and get response.

## :bricks: Application structure

![structure](https://user-images.githubusercontent.com/96411307/195589249-74ca5873-c0c9-4f4f-af2e-3bf283fe683f.png)
