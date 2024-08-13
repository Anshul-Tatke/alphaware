Overview :-
The ContinentFetcher application is a Spring Boot-based REST API that fetches continent data from a specified URL, stores it in an H2 database, and provides endpoints to retrieve the data. The application is structured with the following components:

Controller: Manages the API endpoints.
Service: Handles the business logic.
Repository: Manages database interactions.

+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

Requirements:-

1. Java17.
2. Maven.
3. An IDE for running and testing API application.
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

Setup Instruction:-

1.Clone the Repository.
2.Build the Application.
3.Run the Application.
4.Access the H2 Database.
    The H2 database console can be accessed at: http://localhost:8080/h2-console.

    Use the following settings to log in:

    JDBC URL: jdbc:h2:mem:testdb
    Username: sa
    Password: "Please check in properties file"
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

API Endpoints:-

1. Fetch and Save Data from URL
Endpoint: /continent/get-data-from-url
Method: GET
Description: Fetches data from the provided URL and saves it into the H2 database.
Response: Data is fetched and saved Successfully.

2. Get All Data
Endpoint: /continent/getAllData
Method: GET
Description: Retrieves a list of all continent data stored in the database.
Response: Returns a JSON array of continent objects.

3. Get Continent by ID
Endpoint: /continent/getById/{id}
Method: GET
Description: Fetches a specific continent by its ID.
Path Variable: id (type: long)
Response: Returns a JSON object representing the continent.
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

Example Usage:-

1.Fetch and Save Data :- http://localhost:8080/continent/get-data-from-url
2.Retrieve All Data :- http://localhost:8080/continent/getAllData
3.Retrieve Data by ID :- http://localhost:8080/continent/getById/1 (#Replace 1 with the actual ID you wish to fetch.)

Note :- I Have added Swagger also in this project so we can access it easily using this given URL

                            http://localhost:8080/swagger-ui/index.html#/

++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++



