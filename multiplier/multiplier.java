package multiplier;


public class multiplier
{
    
    public static int[] multiplier(int[] a, int[]b, int[] c)
    {
        for(int j = 0; j<a.length; j++)
        {
            if (b[j]==1)
                c[j-1] += a[j];
        }
        return c;
    }

    
    public static void main(String args[])
    {
        int[] a = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0}; //binary of 2
        int[] b = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1}; //binary of 3
        int[] c = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}; //binary of 0
        
        int z[] = multiplier(a, b, c).clone();
        
        for (int i = 0; i<z.length; i++)
            System.out.print(z[i]);
        System.out.println();
        
    }
}
