import java.util.*;
import java.util.Scanner;
public class Array
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      final int LIMIT = 10;
      
      ArrayList<String> arr = new ArrayList<String>();
      
      System.out.println("Enter 10 Strings");
      
      
      //  Initialize the array values
      for (int index = 0; index < LIMIT; index++)
         arr.add(scan.nextLine());
      
      //  Print the array values
      for (int i = 9; i >= 0; i--)
        System.out.print(arr.get(i) + " ");
         
   }
}