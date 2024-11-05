import java.util.Scanner;

/**
 * The UserStory class manages a list of drivers, allowing for
 * operations such as finding available drivers, booking a driver,
 * and identifying the closest available driver.
 */
public class UserStory {
  
  // Array to store Driver objects
  Driver[] drivers = new Driver[20];

  /**
   * Constructor to initialize the UserStory object by creating drivers from files.
   */
  public UserStory(String namesFile, String ratingsFile, String distancesFile, String availableFile) {
    drivers = createDrivers(namesFile, ratingsFile, distancesFile, availableFile);
  }

  /**
   * Reads data from files and creates an array of Driver objects.
   */
  public Driver[] createDrivers(String namesFile, String ratingsFile, String distancesFile, String availableFile) {
    
    String[] namesData = FileReader.toStringArray(namesFile);
    double[] ratingsData = FileReader.toDoubleArray(ratingsFile);
    double[] distancesData = FileReader.toDoubleArray(distancesFile);
    String[] availableData = FileReader.toStringArray(availableFile);

    Driver[] tempResponses = new Driver[namesData.length];

    // Populate tempResponses with Driver objects
    for (int index = 0; index < tempResponses.length; index++) {
      tempResponses[index] = new Driver(namesData[index], ratingsData[index], distancesData[index], availableData[index]);
    }

    return tempResponses;
  }

  /**
   * Prints the details of available drivers.
   */
  public void printAvailableDrivers() {
    for (int i = 0; i < drivers.length; i++) {
      if (drivers[i].getAvailable().equals("Yes")) {
        System.out.println(drivers[i].toString());
      }
    }
  }

  /**
   * Finds and returns the name and distance of the closest available driver.
   */
  public String closestAvailableDriver() {
    double closest = drivers[0].getDistance();
    int index = 0;
    Driver[] copyList = new Driver[drivers.length];
    
    // Copy available drivers to a new list
    for (int i = 0; i < drivers.length; i++) {
      if (drivers[i].getAvailable().equals("Yes")) {
        copyList[i] = drivers[i];
      } else {
        copyList[i] = new Driver();
      }
    }

    // Find the closest available driver
    for (int i = 0; i < copyList.length; i++) {
      if (!copyList[i].getName().equals("") && copyList[i].getDistance() < closest) {
        closest = copyList[i].getDistance();
        index = i;
      }
    }
    
    return copyList[index].getName() + " is available and this far: " + copyList[index].getDistance();
  }

  /**
   * Books a driver by setting their availability to "No".
   */
  public void bookDriver(String driverName) {
    for (int i = 0; i < drivers.length; i++) {
      if (drivers[i].getName().equals(driverName)) {
        drivers[i].setAvailable("No");
      }
    }
  }

  /**
   * Returns a string representation of all drivers in the database.
   */
  public String toString() {
    String tempString = "";
    for (int i = 0; i < drivers.length; i++) {
      tempString += drivers[i].toString() + "\n";
    }

    return "The drivers in the database are \n" + tempString;
  }
  
}
