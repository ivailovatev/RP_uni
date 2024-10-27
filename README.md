- Project Summary: MVC API Integration with OpenWeather
  - Use my key from: https://home.openweathermap.org/api_keys
- Project: MVC API Integration with OpenWeather
- Programming Language: Java
- Technologies: Spring Boot, Thymeleaf, OpenWeather API

- Project Objective: The goal of the project is to create a software application that integrates an external API service to retrieve weather data. The project uses the OpenWeather API to provide current weather information to users.

- Key Features
 1) - Weather Data Retrieval: The application performs HTTP GET requests to the OpenWeather API to obtain weather information for a specified city. Users can specify a city name through URL parameters.
 2) - User Interface: Using Thymeleaf, the application provides a web interface where users can see the current temperature, weather description, and other relevant data.
 3) - Configuration and Settings: The API key and URL for the OpenWeather API are configured in application.properties, allowing flexibility for changes.
 4) - Access the Application: Open a web browser and go to http://localhost:8081/weather?city=Sofia to see the current weather for the city.
   
- Technical Details
 1) - Server: The application runs on a local server, configured on port 8081.
 2) - Architecture: It uses an MVC (Model-View-Controller) architecture, separating application logic, data processing, and information presentation.
 3) - Logging: Logging is utilized for debugging, enabling developers to monitor execution issues.

- Test:
In the file: weatherInDiffCities.JPG in the project!
