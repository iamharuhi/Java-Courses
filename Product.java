import java.util.Scanner;
public class Product
{    
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n;
        int m = 1;
        
        System.out.println("Enter a positive value");
        n = scan.nextInt();
        

        for (int i=1; i<=n; i++)
        {
            m *= i; 
        }
        
        System.out.println("The product is: " + m);
    }        
}
