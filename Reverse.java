import java.util.Scanner;
public class Reverse
{    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String a;
                
        System.out.println("Enter a string");
        a = scan.nextLine();
        
        System.out.println(Reverser(a));
    }
    
    public static String Reverser(String a)
    {
        String r = "";
        for(int i = a.length()-1; i>=0; i--)
            r = r + a.charAt(i);
     
        return r;
    }
    
}
