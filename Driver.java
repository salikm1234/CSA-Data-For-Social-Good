import java.util.Scanner;

/**
 * Represents a driver with attributes for name, rating, distance, and availability.
 */
public class Driver {

  private String name;       // Driver's name
  private double rating;     // Driver's rating
  private double distance;   // Distance to the driver
  private String available;  // Driver's availability status

  /**
   * Constructor to initialize a Driver object with specific values.
   */
  public Driver(String name, double rating, double distance, String available) {
    this.name = name;
    this.rating = rating;
    this.distance = distance;
    this.available = available;
  }

  /**
   * Default constructor to initialize a Driver object with default values.
   */
  public Driver() {
    this.name = "";
    this.rating = 0.0;
    this.distance = 0.0;
    this.available = "";
  }

  /**
   * Getter methods for the driver's attributes.
   */
  public String getName() {
    return name;
  }

  public double getRating() {
    return rating;
  }

  public double getDistance() {
    return distance;
  }

  public String getAvailable() {
    return available;
  }

  /**
   * Sets the availability status of the driver.
   */
  public void setAvailable(String change) {
    available = change;
  }

  /**
   * Returns a formatted string describing the driver.
   */
  public String toString() {
    return name + " is rated: " + rating + " and is this far: " + distance 
           + " and their availability is: " + available;
  }

}
