# Weather Application

## Overview
The **Weather Application** is built using the Spring Boot MVC model and integrates with a Weather API to provide real-time weather data for any city in the world. Users can search for a city and view detailed weather information, including:

- Current Weather Condition
- Wind Speed
- Visibility
- Humidity
- Chance of Rain

This project demonstrates the use of Spring Boot for web application development and external API integration.

---

## Features
- **Search Functionality**: Users can search for any city in the world to get weather details.
- **Real-Time Data**: Fetches real-time data using the Weather API.
- **Detailed Weather Information**:
  - Current weather conditions (e.g., sunny, cloudy, etc.).
  - Wind speed.
  - Visibility.
  - Humidity levels.
  - Chance of rain.
- **Responsive Design**: User-friendly interface compatible with various devices.

---

## Technologies Used

### Backend:
- **Spring Boot MVC**: For building the web application.
- **Weather API**: For fetching real-time weather data.

### Frontend:
- HTML, CSS, JavaScript: For building the user interface.
- Thymeleaf: For dynamic content rendering.

### Others:
- Maven: For dependency management.
- Git: For version control.

---

## Installation and Usage

### Prerequisites:
- Java Development Kit (JDK) 8 or higher.
- Maven installed on your system.
- Access to the Weather API (API key required).

### Steps to Run the Application:
1. Clone the repository:
   ```bash
   git clone https://github.com/<your-username>/Weather_Application.git
   ```

2. Navigate to the project directory:
   ```bash
   cd Weather_Application
   ```

3. Configure the Weather API:
   - Open the `application.properties` file.
   - Add your Weather API key:
     ```properties
     weather.api.key=YOUR_API_KEY
     weather.api.base.url=https://api.example.com/weather
     ```

4. Build the application:
   ```bash
   mvn clean install
   ```

5. Run the application:
   ```bash
   mvn spring-boot:run
   ```

6. Access the application in your browser at:
   ```
   http://localhost:8080
   ```

---

## Project Structure
```
Weather_Application
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.example.weather
│   │   │       ├── controller
│   │   │       │   └── WeatherController.java
│   │   │       ├── service
│   │   │       │   └── WeatherService.java
│   │   │       ├── model
│   │   │       │   └── Weather.java
│   │   │       └── WeatherApplication.java
│   │   ├── resources
│   │   │   ├── templates
│   │   │   │   └── index.html
│   │   │   └── application.properties
│   └── test
├── pom.xml
└── README.md
```

---

## API Integration
- The application fetches weather data from a Weather API.
- Make sure to replace `YOUR_API_KEY` in the `application.properties` file with your actual API key.

---

## Screenshots

### Home Page:
Displays a search bar for users to enter the city name.

### Weather Details Page:
Shows detailed weather information for the searched city, including temperature, wind speed, visibility, humidity, and chance of rain.

---

## Contributions
Contributions are welcome! To contribute:
1. Fork the repository.
2. Create a new branch:
   ```bash
   git checkout -b feature-branch
   ```
3. Commit your changes:
   ```bash
   git commit -m "Add your message here"
   ```
4. Push to the branch:
   ```bash
   git push origin feature-branch
   ```
5. Open a Pull Request.

---

## License
This project is licensed under the MIT License. See the LICENSE file for details.

---

## Acknowledgments
- Thanks to the Weather API providers for real-time weather data.
- Inspired by the need for simple and user-friendly weather applications.

---

## Contact
For any queries or suggestions, please contact:
- **GitHub**: [Your GitHub Profile](https://github.com/<your-username>)
