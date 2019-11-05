import java.util.*;
public class Parentheses
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String that has parentheses");
        String t = scan.nextLine();
        if(algorithm(t)==true)
            System.out.println("Parentheses formatted correctly");
        if(algorithm(t)==false)
            System.out.println("Parentheses formated incorectly");
    }

    public static Boolean algorithm(String t)
    {
        Stack<Character> s = new Stack<Character>();
        char choice;
        for (int i = 0; i < t.length(); i++)
        {
            if (t.charAt(i)=='(' || t.charAt(i)=='[' || t.charAt(i)=='{')
              s.push(t.charAt(i));
            if (t.charAt(i)==')' || t.charAt(i)==']' || t.charAt(i)=='}')
            {
               //Case and Break.
               
               choice = t.charAt(i);
               {
                switch (choice) 
                {
                    case ')':
                        if (s.pop()!='(')
                        return false;
                        break;
                    case '}':
                        if (s.pop()!='{')
                        return false;
                        break;  
                    case ']':
                        if (s.pop()!='[')
                        return false;
                        break;
                }
               }
            }
        }
        return true;
   }
}