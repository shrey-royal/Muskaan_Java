interface Person {
    //public static final
    // String name = null;
    // int age = 0;
    // boolean relationshipStatus = false;

    //abstract methods only
    void display();
}

class Employee implements Person {
    String name = null;
    int age = 0;
    boolean relationshipStatus = false;

    Employee(String name, int age, boolean relationshipStatus) {
        this.name = name;
        this.age = age;
        this.relationshipStatus = relationshipStatus;
    }

    @Override
    public void display() {
        System.out.println("Name: " + this.name + "\nAge: " + this.age + "\nRelationShip Status: " + this.relationshipStatus);
    }
}

public class INterfacess {
    public static void main(String[] args) {
        Employee e = new Employee("Muskan", 999, true);
        e.display();
    }
}

/*
Tasks:

Scenario 1: Payment Gateway Integration
Design an interface called "PaymentGateway" with methods like "processPayment" and "refundPayment." Implement classes like "PayPalGateway" and "StripeGateway" that provide specific implementations for these interface methods.

Scenario 2: Messaging Service Integration
Develop an interface called "MessagingService" with methods like "sendMessage" and "receiveMessage." Implement classes like "EmailService" and "SMSService" that provide specific implementations for these interface methods.

Scenario 3: Database Connectivity
Create an interface called "DatabaseConnection" with methods like "connect" and "disconnect." Implement classes like "MySQLConnection" and "PostgreSQLConnection" that provide specific implementations for these interface methods.

Scenario 4: Online Ordering System
Design an interface called "OrderProcessor" with methods like "placeOrder" and "cancelOrder." Implement classes like "CreditCardProcessor" and "PayPalProcessor" that provide specific implementations for these interface methods.

Scenario 5: Travel Booking System
Develop an interface called "TravelBooking" with methods like "bookTicket" and "cancelBooking." Implement classes like "FlightBooking" and "HotelBooking" that provide specific implementations for these interface methods.

Scenario 6: Social Media Integration
Create an interface called "SocialMediaIntegration" with methods like "sharePost" and "likePost." Implement classes like "FacebookIntegration" and "TwitterIntegration" that provide specific implementations for these interface methods.

Scenario 7: Geolocation Services
Design an interface called "GeolocationService" with methods like "getCurrentLocation" and "calculateDistance." Implement classes like "GoogleMapsService" and "HereMapsService" that provide specific implementations for these interface methods.

Scenario 8: File Processing Application
Develop an interface called "FileProcessor" with methods like "readFile" and "writeFile." Implement classes like "TextFileProcessor" and "CSVFileProcessor" that provide specific implementations for these interface methods.

Scenario 9: Online Music Streaming
Create an interface called "MusicPlayer" with methods like "playSong" and "stopSong." Implement classes like "SpotifyPlayer" and "AppleMusicPlayer" that provide specific implementations for these interface methods.

Scenario 10: Weather Forecast Service
Design an interface called "WeatherService" with methods like "getCurrentWeather" and "getForecast." Implement classes like "OpenWeatherMapService" and "AccuWeatherService" that provide specific implementations for these interface methods.
*/