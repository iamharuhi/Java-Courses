//import the scanner
import java.util.Scanner;
public class Driver
{
   public static void main(String[] args)
   {
      
      //initialize the variables
      System.out.println(" _________________________         _____");
      System.out.println("|                         \\         \\ U \\__      _____");
      System.out.println("|  U HART                  \\_________\\   \\/_______\\___\\_____________");
      System.out.println("|      AIR                 /          < /_/   .....................  `-.");
      System.out.println("|_________________________/            `-----------,----,--------------'");
      System.out.println("                                                 _/____/");

      //initialize scanners and objects
      Scanner scan = new Scanner(System.in); 
      Scanner scan1 = new Scanner(System.in);
      Plane plane = new Plane();
      //menu options
      String choice = null;
      do {
           
            plane.printCmd();
            //Case and Break.
            choice = scan.next();
            {
                switch (choice) {
                    case "A":
                        //add a passenger
                        plane.addPass();
                        break;
                    case "P":
                        //print seating
                        plane.printAll();
                        break;  
                }
            }
            //end the program
        } while (!"Q".equals(choice));
      
   }
}
