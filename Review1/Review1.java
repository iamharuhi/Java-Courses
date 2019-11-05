
public class Review1
{
    public static void main(String args[])
    {
        System.out.println("It is " + isMultiple(100, 5) + " that 5 is a multple of 100");
        System.out.println("It is " + isEven(7) + " that 7 is even");
        System.out.println("The sum of all odd numbers in 43 is " + oddSum(43) );
        System.out.println("The number of vowels in Potatoe is " + numVowels("Potatoe") );
    }
       
    public static boolean isMultiple(long n, long m)
        {
            return (n%m == 0);
        }

    public static boolean isEven(int i)
    {
        for(int n = 1; n<=i; n=n+2)
        {   if(n == i)
            return false;
        }
        return true;
    }

    public static int oddSum(int i)
    {
        int x = 0;
        for(int n = 1; n<=i; n=n+2)
        {   
            x += n;
        }
        return x;
    }

    public static int numVowels(String s)
    {
        int x = 0;
        for(int n = 0; n<s.length(); n++)
        {
            if(s.charAt(n) == 'a' || s.charAt(n)== 'e' || s.charAt(n)== 'i' || s.charAt(n)== 'o' || s.charAt(n)== 'u')
            x++;
        }
        return x;
    }
}

