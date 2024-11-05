import java.util.Scanner;

public class DataRunner {
  public static void main(String[] args) {

UserStory story = new UserStory("Names.txt", "Ratings.txt","Distance.txt", "Available.txt");
    story.printAvailableDrivers();
    // System.out.println(story);
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println();
story.bookDriver("Bob Smith");
story.bookDriver("Cathy Lee");
story.bookDriver("David Brown");
story.bookDriver("Emma Wilson");
story.bookDriver("Frank Thompson");
story.bookDriver("Grace Martinez");
story.bookDriver("Henry White");
story.bookDriver("Irene Davis");
   story.printAvailableDrivers();

    
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println(story.closestAvailableDriver());

story.bookDriver("Mona Adams");

        
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println(story.closestAvailableDriver());

   story.bookDriver("Rachel Evans");

        
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println(story.closestAvailableDriver()); 
    
    
  }
}