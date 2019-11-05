//import the scanner
import java.util.Scanner;
public class CourseTest
{
   public static void main(String[] args)
   {
      
      //initialize the variables
      int score;
      String courseName;
      String name;
      int count = 0;
      //initialize scanners and objects
      
      Scanner scan = new Scanner(System.in); 

      Course course = new Course();
      
      
      String choice = null;
      do {

            System.out.println("**************************");
            //System.out.println("Enter 1 to reset the course name");
            System.out.println("Enter 1 to enter a student");
            System.out.println("Enter 2 to print all students");
            //System.out.println("Enter 4 to search for a student");
            System.out.println("Enter 5 to Quit");
            System.out.println("**************************");

            //Case and Break.
            choice = scan.next();
            {
                switch (choice) {
                    case "1":
                        course.addStudent();
                        count++;
                        break;
                    case "2":
                        //print the array
                        course.roll();
                        break;  
                }
            }
            //end the program
        } while (!"5".equals(choice));
      
   }
}
