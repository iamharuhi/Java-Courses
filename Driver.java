import java.util.*;
import java.io.*;
public class Driver 
{
  public static void main(String[] args) //throws IOException
  {
     ArrayList<Person> list = new ArrayList<Person>();
     Scanner fileScan;
     String file, firstname, lastname;
     int zip;
      
     Scanner scan = new Scanner(System.in);
     System.out.println("Please enter exact name of file to be used:");
     file = scan.nextLine();
     
      try
     {
      fileScan = new Scanner (new File(file));    
      while (fileScan.hasNext())
      {
         firstname = fileScan.next();
         lastname = fileScan.next();
         zip = fileScan.nextInt();
         list.add( new Person(firstname, lastname, zip) );
      }
     }
     
      catch (FileNotFoundException e){
      System.out.println("File Not Found");
     }
     
     System.out.println();
     System.out.println("First \t Last \t Zip");
     System.out.println("==========================");
     System.out.println();
      
     for (int index = 0; index < list.size(); index++){             
               System.out.println(list.get(index) + " ");
               //System.out.println();
     }      
  }
}
