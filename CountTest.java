import java.util.Scanner;
public class CountTest
{    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String a;
        
        
        System.out.println("Enter a string");
        a = scan.nextLine();
        
        
      
        System.out.println("The letter A appears " + CountA(a) + " times.");
    }
    
    public static int CountA(String a)
    {
        int m = 0;
        for (int i=0; i<a.length(); i++)
        {
            if (a.charAt(i) == 'a' || a.charAt(i) == 'A')
                m++;
        }
        return m;
    }
    
}
