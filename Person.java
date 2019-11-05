
public class Person
{
   private String firstName, lastName;
   private int zip;
   //-----------------------------------------------------------------
   //  Constructor: Sets up this student with the specified values.
   //-----------------------------------------------------------------
   public Person(String first, String last, int z1)
   {
      firstName = first;
      lastName = last;
      zip = z1;

   }
  
   
   //-----------------------------------------------------------------
   //  Returns a string description of this Student object.
   //-----------------------------------------------------------------
   public String toString()
   {
      String result;
      
      result = firstName + "\t " + lastName + "\t " + zip;
      
      return result;
   }
}
